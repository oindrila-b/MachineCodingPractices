package Splitwise.SpliwiseOptimizationPart2.splitManager.validator.implementations;

import Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;
import Splitwise.SpliwiseOptimizationPart2.splitManager.validator.SplitValidator;

import java.util.List;

public class SplitValidatorManager {

    private SplitValidator splitValidator;

    public SplitValidatorManager() {
        splitValidator = new DefaultSplitValidator();
    }

    public boolean isSplitValid(List<SplitModel> splits, ExpenseType expenseType, Double totalAmount){
        switch (expenseType) {
            case EXACT -> {
                splitValidator = new ExactSplitValidator();
                return  splitValidator.isValid(splits,totalAmount);
            }
            case PERCENT -> {
                splitValidator = new PercentSplitValidator();
                return splitValidator.isValid(splits, totalAmount);
            }
            default -> {
                return splitValidator.isValid(splits, totalAmount);
            }
        }
    }

}
