package Splitwise.SplitwiseOptimized.global;

import Splitwise.SplitwiseOptimized.user.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalExpenseTracker {
    private Map<User, Map<User,Long>> userOwedAmountMap;

    public GlobalExpenseTracker() {
        userOwedAmountMap = new HashMap<>();
    }

    public void addExpense(User spender, Long amount, User ower) {
        if (userOwedAmountMap.containsKey(spender)) {
            updateExpense(spender,amount,ower);
        }else{
            Map<User,Long> owerMap = new HashMap<>(Map.of(ower,amount));
            userOwedAmountMap.put(spender, owerMap);
        }
    }

    private void updateExpense(User spender, Long amount, User ower)  {
        Map<User,Long> currentExpenseMap = userOwedAmountMap.get(spender);
        Long currentExpenseOfOwer = currentExpenseMap.get(ower);
        Long updatedExpenseOfOwer = currentExpenseOfOwer + amount;
        currentExpenseMap.put(ower,updatedExpenseOfOwer);
        userOwedAmountMap.put(spender,currentExpenseMap);
    }


    // TODO
    public void showBalance(List<User> users) {
        for (User u: users) {
            Map<User, Long> expenseMap = userOwedAmountMap.get(u);
            for (var entry : expenseMap.entrySet()){
                Map<User,Long> userLongMap = userOwedAmountMap.get(entry.getKey());
                Long spenderOwed = userLongMap.getOrDefault(u,0L);
                Long netExpense = entry.getValue() - spenderOwed;
                if (netExpense <0){
                    userLongMap.put(u, Math.abs(netExpense));
                    userOwedAmountMap.put(entry.getKey(), userLongMap);
                    System.out.println(entry.getKey().name() + " has settled scores with " + u.name());
                }else {

                }
            }
        }
    }

}
