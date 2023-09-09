package SnakeAndLadder.SnakeAndLadderOptimised.utils.dice.implementations;

import SnakeAndLadder.SnakeAndLadderOptimised.utils.dice.Dice;
import SnakeAndLadder.SnakeAndLadderOptimised.utils.rolledValueCalculator.RolledValueCalculator;

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
