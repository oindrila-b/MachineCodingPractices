package old_practice.Splitwise.SplitwiseOptimized.exceptions;

public class NoExpenseListFound extends Exception{
    public NoExpenseListFound() {
        super("No Expense List found against the provided user-id");
    }
}
