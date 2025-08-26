package old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.assetInitializer;

import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.models.implementations.Player;
import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.utils.dice.Dice;

import java.util.List;
import java.util.Map;

public interface BoardAssetInitializer {
    void instantiateEntities();
    List<Player> getPlayersList();
    Map<Integer, Integer> getSnakePositionsMap();
    Map<Integer, Integer> getLadderPositionsMap();
    Dice getDice();
}
