package SnakeAndLadder.SnakeAndLadderSolution.utils;

import SnakeAndLadder.SnakeAndLadderSolution.exceptions.DiceValueExceededException;

import java.util.Random;

public class Dice {

    private int diceNumber;
    private Random random;
    private final int minimumDiceRoll = 1;

    public Dice(int diceNumber) throws DiceValueExceededException {
        if (diceNumber <= 6) {
            this.diceNumber = diceNumber;
        } else throw new DiceValueExceededException();
        random = new Random();
    }

    public int getDiceRolledNumber() {
        return  random.nextInt((diceNumber  - minimumDiceRoll + 1) + minimumDiceRoll);
    }


}
