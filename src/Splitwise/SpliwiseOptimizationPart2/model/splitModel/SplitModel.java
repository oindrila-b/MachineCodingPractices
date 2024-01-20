package Splitwise.SpliwiseOptimizationPart2.model.splitModel;

public class SplitModel {

    private String userID;
    private Double owedAmount;

    public SplitModel(String userID, Double owedAmount) {
        this.userID = userID;
        this.owedAmount = owedAmount;
    }

    public void setOwedAmount(Double owedAmount) {
        this.owedAmount = owedAmount;
    }

    public String getUserID() {
        return userID;
    }

    public Double getOwedAmount() {
        return owedAmount;
    }
}
