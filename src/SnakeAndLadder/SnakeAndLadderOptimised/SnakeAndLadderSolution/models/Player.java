package SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

    private Map<String, Integer> playerNameAndScoreMap;
    private final int numberOfPlayers;
    private List<String> playerNames;

    public Player(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        playerNameAndScoreMap = new HashMap<>();
        playerNames = new ArrayList<>();
    }

    public void initialisePlayersWithInitialScore(List<String> names) {
        this.playerNames = names;
        for (int i = 0; i < numberOfPlayers; i++) {
            playerNameAndScoreMap.put(names.get(i), 0 );
        }
    }

    public Map<String, Integer> getPlayerNameAndScoreMap() {
        return playerNameAndScoreMap;
    }

    public void setPlayerNameAndScoreMap(Map<String, Integer> playerNameAndScoreMap) {
        this.playerNameAndScoreMap = playerNameAndScoreMap;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public List<String> getPlayerNames() {
        return playerNames;
    }

    public void updatePlayerScoreMap(String name, int score) {
        playerNameAndScoreMap.put(name, score);
    }

}
