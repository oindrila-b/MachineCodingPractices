package old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.implementations;

import old_practice.Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import old_practice.Splitwise.SpliwiseOptimizationPart2.exceptions.IllegalExpenseTypeException;
import old_practice.Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;
import old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.SplitCalculator;

import java.util.List;

public class EqualSplitCalculator implements SplitCalculator {
    @Override
    public void calculateSplit(List<SplitModel> splits, int numberOfUsers, ExpenseType expenseType, Double totalAmount)  throws IllegalExpenseTypeException {
        if (expenseType != ExpenseType.EQUAL) throw new IllegalExpenseTypeException(expenseType) ;

        final Double equalSplit = numberOfUsers <= 0 ? totalAmount : (totalAmount / numberOfUsers);
        splits.forEach(splitModel -> {
            splitModel.setOwedAmount(equalSplit);
        });

    }
}
