package SnakeAndLadderSolution.exceptions;

public class LadderPositionLimitationException extends Exception{
    public LadderPositionLimitationException() {
        super("Number of Ladder Positions Exceeded Allowed value of 2");
    }
}
