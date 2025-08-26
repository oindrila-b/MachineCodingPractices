package old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.dice.implementations;

import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.dice.Dice;
import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.rolledValueCalculator.RolledValueCalculator;

public class DefaultDiceImplementation implements Dice {

    private RolledValueCalculator rolledValueCalculator;

    public DefaultDiceImplementation(RolledValueCalculator rolledValueCalculator) {
        this.rolledValueCalculator = rolledValueCalculator;
    }

    @Override
    public Integer rollDice() {
        rolledValueCalculator.calculateRolledValue();
        return rolledValueCalculator.getRolledValue();
    }

}
