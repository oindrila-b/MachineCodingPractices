package SnakeAndLadderOptimised.models.implementations;

import SnakeAndLadderOptimised.models.BoardAsset;

public class Snake implements BoardAsset {
    private Integer startPosition;
    private Integer endPosition;

    public Snake(Integer startPosition, Integer endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }


    @Override
    public Integer getStartPosition() {
        return this.startPosition;
    }

    @Override
    public Integer getEndPosition() {
        return this.endPosition;
    }
}
