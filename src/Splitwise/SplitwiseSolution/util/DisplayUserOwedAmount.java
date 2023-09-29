package Splitwise.SplitwiseSolution.util;

import Splitwise.SplitwiseSolution.model.User;

import java.util.List;
import java.util.Map;

public class DisplayUserOwedAmount {
    public static void printAllUserTransaction(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(" Transactions for " + users.get(i).getUserName() + "  =========================================");
            for (Map.Entry<String, Double> entry : users.get(i).getSpenderIdAndOwedAmountMap().entrySet()) {
                System.out.println(users.get(i).getUserName() + " owes  " + entry.getKey() + " an amount of " + entry.getValue());
            }
        }
    }
}
