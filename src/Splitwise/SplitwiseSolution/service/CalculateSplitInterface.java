package Splitwise.SplitwiseSolution.service;

import Splitwise.SplitwiseSolution.constants.ExpenseType;
import Splitwise.SplitwiseSolution.model.User;

import java.util.List;

public interface CalculateSplitInterface {

    void calculateSplit(Double totalAmountSpent,
                        User user,
                        Integer numberOfUsers,
                        ExpenseType expenseType,
                        List<User> allUser,
                        List<Double> expenseValues);

}
