package Splitwise.SplitwiseOptimized.global;

import Splitwise.SplitwiseOptimized.exceptions.NoExpenseListFound;
import Splitwise.SplitwiseOptimized.model.OwedExpense;

import java.util.HashMap;
import java.util.Map;

public class GlobalExpenseTracker {

    private Map<String, OwedExpense> expenseMap;

    public GlobalExpenseTracker() {
        expenseMap = new HashMap<>();
    }

    public void setExpenseMap(Map<String, OwedExpense> expenseMap) {
        this.expenseMap = expenseMap;
    }

    public static GlobalExpenseTracker getInstance() {
        return new GlobalExpenseTracker();
    }

    public  Map<String, Double> getExpenseMap(String userID) throws NoExpenseListFound{
       try {
           Map<String, Double>  owedExpenseMap = expenseMap.get(userID).getOwedExpenseMap();
           if (owedExpenseMap == null || owedExpenseMap.isEmpty()) throw new NoExpenseListFound();
           return owedExpenseMap;
       }catch (Exception e) {
            throw new NoExpenseListFound();
       }
    }

    public void addUserExpense(String userId, OwedExpense owedExpense) throws NoExpenseListFound {
        if (expenseMap.containsKey(userId)) {
            updateUserExpense(userId,owedExpense);
        } else {
            expenseMap.put(userId, owedExpense);
        }
    }

    private void updateUserExpense(String userID, OwedExpense expenses) throws NoExpenseListFound{
        // First get the Expense object
        OwedExpense currentExpense = expenseMap.get(userID);
        // if expense object is null, throw exception
        if (currentExpense == null) throw new NoExpenseListFound();
        // otherwise get the expense mao
        Map<String,Double> currentExpenseMap = currentExpense.getOwedExpenseMap();
        // if expense map is null or empty, throw exception
        if (currentExpenseMap == null || currentExpenseMap.isEmpty()) throw new NoExpenseListFound();
        // else for each entry in the expense map
        for (var entry : currentExpenseMap.entrySet()) {
            // check if our passed expenses has the same key attribute as the current entry
            if (expenses.getOwedExpenseMap().containsKey(entry.getKey())) {
                // get the amount from the current expense map and add it to the value of the expense map provided
                Double updatedAmount = expenses.getOwedExpenseMap().get(entry.getKey()) + entry.getValue();
                // put the updated value in the current expense map
                currentExpenseMap.put(entry.getKey(), updatedAmount);
            }
        }
        currentExpense.setOwedExpenseMap(currentExpenseMap);
        expenseMap.put(userID, currentExpense );
    }

}
