package old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager;

import old_practice.Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import old_practice.Splitwise.SpliwiseOptimizationPart2.exceptions.IllegalExpenseTypeException;
import old_practice.Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;
import old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.SplitCalculator;
import old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.implementations.EqualSplitCalculator;
import old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.calculator.implementations.PercentSplitCalculator;
import old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.validator.implementations.SplitValidatorManager;

import java.util.List;

public class DefaultSplitManager implements SplitManager{

    private SplitValidatorManager splitValidatorManager;
    private SplitCalculator splitCalculator;

    public DefaultSplitManager() {
        splitValidatorManager= new SplitValidatorManager();
        splitCalculator = new EqualSplitCalculator();
    }

    public static DefaultSplitManager createInstance() {
        return new DefaultSplitManager();
    }

    private boolean isSplitValid(List<SplitModel> splits, ExpenseType expenseType, Double totalAmount) {
       return splitValidatorManager.isSplitValid(splits,expenseType,totalAmount);
    }

    @Override
    public void calculateSplit(List<SplitModel> splits, ExpenseType expenseType, int numberOfUsers, Double totalAmount) throws IllegalExpenseTypeException {
        if (isSplitValid( splits, expenseType, totalAmount)){
            switch (expenseType) {
                case EQUAL -> splitCalculator.calculateSplit(splits,numberOfUsers,expenseType, totalAmount);
                case EXACT -> {
                    splitCalculator = new EqualSplitCalculator();
                    splitCalculator.calculateSplit(splits, numberOfUsers, expenseType, totalAmount);
                }
                case PERCENT -> {
                    splitCalculator = new PercentSplitCalculator();
                    splitCalculator.calculateSplit(splits, numberOfUsers,expenseType, totalAmount);
                }
            }

        } else {
            throw new IllegalExpenseTypeException(expenseType);
        }
    }

    @Override
    public List<SplitModel> getFinalSplitValues() {
        return null;
    }
}
