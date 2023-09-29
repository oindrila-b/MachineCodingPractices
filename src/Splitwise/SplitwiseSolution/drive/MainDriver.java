package Splitwise.SplitwiseSolution.drive;

import Splitwise.SplitwiseSolution.constants.ExpenseType;
import Splitwise.SplitwiseSolution.model.User;
import Splitwise.SplitwiseSolution.service.CalculateSplitInterface;
import Splitwise.SplitwiseSolution.service.implementations.DefaultSplitCalculator;
import Splitwise.SplitwiseSolution.util.DisplayUserOwedAmount;

import java.util.ArrayList;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        User user1 = new User("1", "Rohan", "roh@gmail.com", 255889966331144L);
        User user2 = new User("2", "Shivam", "shv@gmail.com", 123654789874563L);
        User user3 = new User("3", "Lijat", "lij@gmail.com", 51956237844265L);
        User user4 = new User("4", "Shubh", "shb@gmail.com", 77889966554411L);

        Double totalSpent = 1000D;

        List<User> spendingUser= new ArrayList<>();
        spendingUser.add(user2);
        spendingUser.add(user3);
        spendingUser.add(user4);


        List<Double> expenses = new ArrayList<>();
        expenses.add(40D);
        expenses.add(20D);
        expenses.add(20D);
        expenses.add(20D);

        CalculateSplitInterface calculateSplitInterface = new DefaultSplitCalculator();
         calculateSplitInterface.calculateSplit(totalSpent, user1, 4, ExpenseType.EQUAL, spendingUser,expenses);

        Double expenditure2= 1250D;

        List<User> spendingUser2= new ArrayList<>();
        spendingUser2.add(user2);
        spendingUser2.add(user3);


        List<Double> expenses2 = new ArrayList<>();
        expenses2.add(370D);
        expenses2.add(880D);

   calculateSplitInterface.calculateSplit(expenditure2, user1, 4, ExpenseType.EXACT, spendingUser2,expenses2);

        Double expenditure3= 1200D;

        List<User> spendingUser3= new ArrayList<>();
        spendingUser3.add(user1);
        spendingUser3.add(user2);
        spendingUser3.add(user3);
        spendingUser3.add(user4);


        calculateSplitInterface.calculateSplit(expenditure3, user4, 4, ExpenseType.PERCENT, spendingUser3,expenses);

        DisplayUserOwedAmount.printAllUserTransaction(spendingUser3);

    }
}
