package Splitwise.SplitwiseOptimized.model;

import java.util.HashMap;
import java.util.Map;

public class OwedExpense {

    private Map<String, Double> owedExpenseMap;

    public OwedExpense() {
        owedExpenseMap = new HashMap<>();
    }

    public Map<String, Double> getOwedExpenseMap() {
        return owedExpenseMap;
    }

    public void setOwedExpenseMap(Map<String, Double> owedExpenseMap) {
        this.owedExpenseMap = owedExpenseMap;
    }
}
