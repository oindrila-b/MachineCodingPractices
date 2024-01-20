package Splitwise.SpliwiseOptimizationPart2.expenseManager.manage;

import Splitwise.SpliwiseOptimizationPart2.model.expenseModel.ExpenseModel;

import java.util.List;

/**
 * This interface holds methods for managing an expense object
 * **/
public interface ManagerInterface {

    /**
    * This method calculates the splits and returns an Expense Model with the calculates split values
    * **/
    ExpenseModel getCalculatedExpense( ExpenseModel model);

}
