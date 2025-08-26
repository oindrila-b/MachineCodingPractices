package old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.implementations;

import old_practice.Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import old_practice.Splitwise.SpliwiseOptimizationPart2.exceptions.IllegalExpenseTypeException;
import old_practice.Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;
import old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.SplitCalculator;

import java.util.List;

public class PercentSplitCalculator implements SplitCalculator {
    @Override
    public void calculateSplit(List<SplitModel> splits, int numberOfUsers,ExpenseType expenseType, Double totalAmount) throws IllegalExpenseTypeException {
        if (expenseType != ExpenseType.PERCENT) throw  new IllegalExpenseTypeException(expenseType);
        splits.forEach(splitModel -> {
            splitModel.setOwedAmount(((splitModel.getOwedAmount() / 100) * totalAmount));
        });
    }
}
