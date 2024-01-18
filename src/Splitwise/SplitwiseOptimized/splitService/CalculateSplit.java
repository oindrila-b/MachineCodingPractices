package Splitwise.SplitwiseOptimized.splitService;

import Splitwise.SplitwiseOptimized.user.User;

import java.util.List;
import java.util.Map;

public interface CalculateSplit {
    void calculate(Long totalExpense, Map<User, Long> userOwedAmountMap, User spender);
}
