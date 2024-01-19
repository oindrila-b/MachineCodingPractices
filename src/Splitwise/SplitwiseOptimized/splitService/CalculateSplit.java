package Splitwise.SplitwiseOptimized.splitService;


import Splitwise.SplitwiseOptimized.model.OwedExpense;
import Splitwise.SplitwiseOptimized.model.User;

import java.util.List;
import java.util.Map;

public interface CalculateSplit {
    void calculate(Long totalExpense, List<OwedExpense> userOwedExpenseList, User spender);
}
