package Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.implementations;

import Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import Splitwise.SpliwiseOptimizationPart2.exceptions.IllegalExpenseTypeException;
import Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;
import Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.SplitCalculator;

import java.util.List;

public class ExactSplitCalculator implements SplitCalculator {
    @Override
    public void calculateSplit(List<SplitModel> splits, int numberOfUsers, ExpenseType expenseType, Double totalAmount) throws IllegalExpenseTypeException {
        if (expenseType != ExpenseType.EXACT) throw new IllegalExpenseTypeException(expenseType) ;
        splits.forEach(splitModel -> {
            splitModel.setOwedAmount(splitModel.getOwedAmount());
        });
    }
}
