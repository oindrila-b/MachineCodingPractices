package old_practice.Splitwise.SpliwiseOptimizationPart2.expenseManager.manage;

import old_practice.Splitwise.SpliwiseOptimizationPart2.model.expenseModel.ExpenseModel;

/**
 * This interface holds methods for managing an expense object
 * **/
public interface ManagerInterface {

    /**
    * This method calculates the splits and returns an Expense Model with the calculates split values
    * **/
    ExpenseModel getCalculatedExpense( ExpenseModel model);

}
