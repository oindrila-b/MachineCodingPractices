package old_practice.Splitwise.SpliwiseOptimizationPart2.model.expenseModel;

import old_practice.Splitwise.SpliwiseOptimizationPart2.constants.ExpenseType;
import old_practice.Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;

import java.util.List;

public class ExpenseModel {
    private String expenseID;
    private String payingUserID;
    private Double paidAmount;
    private List<SplitModel> splits;
    private Integer numberOfUsers;
    private ExpenseType expenseType;

    public ExpenseModel(String expenseID, String payingUserID,
                        Double paidAmount, List<SplitModel> splits,
                        Integer numberOfUsers, ExpenseType expenseType) {
        this.expenseID = expenseID;
        this.payingUserID = payingUserID;
        this.paidAmount = paidAmount;
        this.splits = splits;
        this.numberOfUsers = numberOfUsers;
        this.expenseType = expenseType;
    }

    public String getExpenseID() {
        return expenseID;
    }

    public String getPayingUserID() {
        return payingUserID;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public List<SplitModel> getSplits() {
        return splits;
    }

    public Integer getNumberOfUsers() {
        return numberOfUsers;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }
}
