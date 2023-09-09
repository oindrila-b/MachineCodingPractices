package SnakeAndLadder.SnakeAndLadderOptimised.utils.rollExecutor;

import SnakeAndLadder.SnakeAndLadderOptimised.utils.rolledValueCalculator.RolledValueCalculator;
import SnakeAndLadder.SnakeAndLadderOptimised.utils.rolledValueCalculator.implementations.DefaultRolledValueCalculator;

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
