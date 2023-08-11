package SnakeAndLadderSolution.models;

import java.util.HashMap;
import java.util.Map;

public class Ladders {
    private int numberOfLadders;
    private Map<Integer, Integer> ladderPositionsMap;

    public Ladders(int numberOfLadders) {
        this.numberOfLadders = numberOfLadders;
        ladderPositionsMap = new HashMap<>();
    }


    public int getNumberOfLadders() {
        return numberOfLadders;
    }

    public Map<Integer, Integer> getLadderPositionsMap() {
        return ladderPositionsMap;
    }

    public void setLadderPositionsMap(int startPosition, int endPosition) {
        ladderPositionsMap.put(startPosition, endPosition);
    }

    public void setLadderPositionsMap(Map<Integer, Integer> positionsMap) {
        this.ladderPositionsMap = positionsMap;
    }

}
