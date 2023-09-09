package SnakeAndLadderOptimised.models.implementations;

public class Player {
    private String playerName;
    private Integer playerScore;

    public Player(String playerName, Integer playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Integer getPlayerScore() {
        return playerScore;
    }

    public void updatePlayerScore(Integer score) {
        playerScore =score;
    }
}
