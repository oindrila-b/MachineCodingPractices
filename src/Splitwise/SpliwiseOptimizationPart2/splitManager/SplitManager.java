package Splitwise.SpliwiseOptimizationPart2.splitManager;

import Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import Splitwise.SpliwiseOptimizationPart2.exceptions.IllegalExpenseTypeException;
import Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;

import java.util.List;

public interface SplitManager {

    void calculateSplit(List<SplitModel> splits, ExpenseType expenseType, int numberOfUsers, Double totalAmount) throws IllegalExpenseTypeException;

    List<SplitModel> getFinalSplitValues();
}
