package Splitwise.SpliwiseOptimizationPart2.exceptions;

import Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;

public class IllegalExpenseTypeException extends Exception {
    public IllegalExpenseTypeException(ExpenseType expenseType) {
        super("Illegal expense type provided, cannot find Expense Type of : " + expenseType.toString());
    }
}
