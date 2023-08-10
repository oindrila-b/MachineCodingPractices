package SnakeAndLadderSolution.models;

import java.util.Map;

public class Snakes {
    private int numberOfSnake;
    private Map<Integer, Integer> snakePositionsMap;

    public Snakes(int numberOfSnake) {
        this.numberOfSnake = numberOfSnake;
    }

    public int getNumberOfSnake() {
        return numberOfSnake;
    }


    public Map<Integer, Integer> getSnakePositions() {
        return snakePositionsMap;
    }

    public void setSnakePositions(int startPosition, int endPosition) {
        for (int i = 0; i < numberOfSnake; i++) {
            snakePositionsMap.put(startPosition, endPosition);
        }
    }

}
