package SnakeAndLadderSolution.exceptions;

public class DiceValueExceededException extends Exception {
    public DiceValueExceededException() {
        super("Dice Value Exceeded, Maximum value allowed is 6");
    }
}
