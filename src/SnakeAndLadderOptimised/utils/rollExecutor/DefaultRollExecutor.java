package SnakeAndLadderOptimised.utils.rollExecutor;

import SnakeAndLadderOptimised.utils.rolledValueCalculator.RolledValueCalculator;
import SnakeAndLadderOptimised.utils.rolledValueCalculator.implementations.DefaultRolledValueCalculator;

public class DefaultRollExecutor implements RollExecutor{

    private RolledValueCalculator rolledValueCalculator;

    public DefaultRollExecutor(RolledValueCalculator rolledValueCalculator) {
        this.rolledValueCalculator = rolledValueCalculator == null ? new DefaultRolledValueCalculator():rolledValueCalculator;
    }

    @Override
    public Integer executeRoll() {
        int rolledValueResult = rolledValueCalculator.getRolledValue();
        return rolledValueResult;
    }
}
