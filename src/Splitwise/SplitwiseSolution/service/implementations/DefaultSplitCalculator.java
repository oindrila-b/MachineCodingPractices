package Splitwise.SplitwiseSolution.service.implementations;

import Splitwise.SplitwiseSolution.constants.ExpenseType;
import Splitwise.SplitwiseSolution.model.User;
import Splitwise.SplitwiseSolution.service.CalculateSplitInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultSplitCalculator implements CalculateSplitInterface {


    public DefaultSplitCalculator() {
;
    }

    @Override
    public void calculateSplit(
            Double totalAmountSpent,
            User spendingUser,
            Integer numberOfUsers,
            ExpenseType expenseType,
            List<User> owingUser,
            List<Double> expenseValues) {

        if (totalAmountSpent <= 0) {
            System.out.println("Invalid! Total Amount Spent is 0 or Less");
            return;
        }

        switch (expenseType) {
            case EQUAL -> calculateEqualSplit(totalAmountSpent, spendingUser, numberOfUsers, owingUser);
            case EXACT -> calculateExactSplit(totalAmountSpent, spendingUser, numberOfUsers, owingUser, expenseValues);
            case PERCENT -> calculatePercentageSplit(totalAmountSpent, spendingUser, numberOfUsers, owingUser, expenseValues);
        }

    }

    private void calculateEqualSplit(Double totalAmountSpent, User spendingUser, Integer numberOfUsers, List<User> owingUser) {
        System.out.println(spendingUser.getUserName() + " has spent " + totalAmountSpent);
        //split finalAmount for all the users
        Double split = totalAmountSpent / numberOfUsers;
        for (User u : owingUser) {
            // if current user is the spending user, skip the  process
            if (u.getUserName().equalsIgnoreCase(spendingUser.getUserName())) continue;
            double owedAmount = split;
            calculateOwedAmount(spendingUser, u, owedAmount);
        }

    }

    private void calculateExactSplit(Double totalAmountSpent, User spendingUser, Integer numberOfUsers, List<User> owingUser, List<Double> expenseValues) {
        System.out.println(spendingUser.getUserName() + " has spent " + totalAmountSpent);
        int i = 0;
        for (User u : owingUser) {
            Double split = expenseValues.get(i++);
            // if current user is the spending user, skip the  process
            if (u.getUserName().equalsIgnoreCase(spendingUser.getUserName())) continue;
            double owedAmount = split;
            // if the spender owes something to the user, execute this block
            calculateOwedAmount(spendingUser, u, owedAmount);
        }

    }

    private void calculatePercentageSplit(Double totalAmountSpent, User spendingUser, Integer numberOfUsers, List<User> owingUser, List<Double> expenseValues) {
        System.out.println(spendingUser.getUserName() + " has spent " + totalAmountSpent);
        int i = 0;
        for (User u : owingUser) {
            Double percentage = expenseValues.get(i++);
            System.out.println(percentage);
            Double split = ( (percentage  / 100 ) *  totalAmountSpent);
            // if current user is the spending user, skip the  process
            if (u.getUserName().equalsIgnoreCase(spendingUser.getUserName())) continue;
            double owedAmount = split;
            System.out.println(u.getUserName() + "'s split amount = " + split);
                calculateOwedAmount(spendingUser, u, owedAmount);
            }
    }

    private void calculateOwedAmount(User spendingUser, User u, Double owedAmount) {
        Double spendersOwedValue = spendingUser.getSpenderIdAndOwedAmountMap().get(u.getUserName());
        if (spendersOwedValue != null &&spendersOwedValue != -1) {
            System.out.println(spendingUser.getUserName() +
                    " previously owed " + u.getUserName() +
                    " an amount of " + spendersOwedValue);
            // get the result of the owed value from the calculated split
            owedAmount -= spendersOwedValue;

            if (owedAmount < 0) { // if the result is  -ve , it concludes that spender still owed to current user
                System.out.println("Balance  = " + owedAmount*-1);
                spendingUser.setSpenderIdAndOwedAmountMap(u.getUserName(), owedAmount*-1);
                System.out.println(spendingUser.getUserName() + ", still owes " + u.getUserName() + " a sum of " + owedAmount*-1 + " finalAmount.");
                owedAmount = 0D;
                System.out.println(u.getUserName()  + " owes " +spendingUser.getUserName() + " an finalAmount of  " + owedAmount);
                u.setSpenderIdAndOwedAmountMap(spendingUser.getUserName(), owedAmount);
            } else{
                System.out.println("Balance  = " + owedAmount);
                System.out.println(u.getUserName()  + " owes " +spendingUser.getUserName() + " an finalAmount of  " + owedAmount);
                u.setSpenderIdAndOwedAmountMap(spendingUser.getUserName(), owedAmount);
                owedAmount = 0D;
                spendingUser.setSpenderIdAndOwedAmountMap(u.getUserName(), owedAmount);
            }
        }else{
            // if the spender owes nothing to the user, execute this block
            Double finalAmount = u.getSpenderIdAndOwedAmountMap().getOrDefault(spendingUser.getUserName(), 0D) + owedAmount;
            u.setSpenderIdAndOwedAmountMap(spendingUser.getUserName(),finalAmount );
            System.out.println(u.getUserName()  + " owes " +spendingUser.getUserName() + " an finalAmount of  " + finalAmount);
        }
    }

    }

