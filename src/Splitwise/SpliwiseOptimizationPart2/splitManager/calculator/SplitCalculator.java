package Splitwise.SpliwiseOptimizationPart2.splitManager.calculator;

import Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import Splitwise.SpliwiseOptimizationPart2.exceptions.IllegalExpenseTypeException;
import Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;

import java.util.List;

/**
* This method has only one purpose, and that is to calculate the split based on the expense type
* **/
public interface SplitCalculator {

    void calculateSplit(List<SplitModel> splits,int numberOfUsers,ExpenseType expenseType, Double totalAmount) throws IllegalExpenseTypeException;

}
