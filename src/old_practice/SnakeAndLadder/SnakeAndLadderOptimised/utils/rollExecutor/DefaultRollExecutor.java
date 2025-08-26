package old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.rollExecutor;

import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.rolledValueCalculator.RolledValueCalculator;
import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.rolledValueCalculator.implementations.DefaultRolledValueCalculator;

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
