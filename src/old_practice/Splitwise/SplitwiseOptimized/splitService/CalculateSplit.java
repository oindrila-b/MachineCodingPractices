package old_practice.Splitwise.SplitwiseOptimized.splitService;


import old_practice.Splitwise.SplitwiseOptimized.model.OwedExpense;
import old_practice.Splitwise.SplitwiseOptimized.model.User;

import java.util.Map;

public interface CalculateSplit {
    void calculate(Long totalExpense,Map<User, OwedExpense> owedExpenseMap, User spender);
}
