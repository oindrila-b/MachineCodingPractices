package old_practice.Splitwise.SplitwiseSolution.service;

import old_practice.Splitwise.SplitwiseSolution.constants.ExpenseType;
import old_practice.Splitwise.SplitwiseSolution.model.User;

import java.util.List;

public interface CalculateSplitInterface {

    void calculateSplit(Double totalAmountSpent,
                        User user,
                        Integer numberOfUsers,
                        ExpenseType expenseType,
                        List<User> allUser,
                        List<Double> expenseValues);

}
