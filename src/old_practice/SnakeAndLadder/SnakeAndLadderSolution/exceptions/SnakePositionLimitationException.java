package old_practice.SnakeAndLadder.SnakeAndLadderSolution.exceptions;

public class SnakePositionLimitationException extends Exception{
    public SnakePositionLimitationException() {
        super("Number of Snake Positions Exceeded Allowed value of 2");
    }
}
