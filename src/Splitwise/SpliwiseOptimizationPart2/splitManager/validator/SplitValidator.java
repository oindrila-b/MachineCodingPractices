package Splitwise.SpliwiseOptimizationPart2.splitManager.validator;

import Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;

import java.util.List;


/**
 *  This interface is for validation a split before passing it onto the split calculator
 * **/
public interface SplitValidator {
    boolean isValid(List<SplitModel> splits, Double totalAmount);

}
