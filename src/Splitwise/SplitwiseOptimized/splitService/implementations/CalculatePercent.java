package Splitwise.SplitwiseOptimized.splitService.implementations;

import Splitwise.SplitwiseOptimized.model.OwedExpense;
import Splitwise.SplitwiseOptimized.model.User;
import Splitwise.SplitwiseOptimized.splitService.CalculateSplit;

import java.util.List;
import java.util.Map;

public class CalculatePercent implements CalculateSplit {
    @Override
    public void calculate(Long totalExpense, Map<User, OwedExpense> owedExpenseMap, User spender) {

    }
}
