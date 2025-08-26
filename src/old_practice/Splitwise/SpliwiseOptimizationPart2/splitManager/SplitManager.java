package old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager;

import old_practice.Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import old_practice.Splitwise.SpliwiseOptimizationPart2.exceptions.IllegalExpenseTypeException;
import old_practice.Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;

import java.util.List;

public interface SplitManager {

    void calculateSplit(List<SplitModel> splits, ExpenseType expenseType, int numberOfUsers, Double totalAmount) throws IllegalExpenseTypeException;

    List<SplitModel> getFinalSplitValues();
}
