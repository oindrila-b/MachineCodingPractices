package SnakeAndLadderOptimised.utils.assetInitializer;

import SnakeAndLadderOptimised.models.implementations.Player;
import SnakeAndLadderOptimised.utils.dice.Dice;

import java.util.List;
import java.util.Map;

public interface BoardAssetInitializer {
    void instantiateEntities();
    List<Player> getPlayersList();
    Map<Integer, Integer> getSnakePositionsMap();
    Map<Integer, Integer> getLadderPositionsMap();
    Dice getDice();
}
