package SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.utils;

import SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.exceptions.LadderPositionLimitationException;
import SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.exceptions.SnakePositionLimitationException;
import SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.models.Ladders;
import SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.models.Player;
import SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.models.Snakes;

import java.util.List;
import java.util.Map;

public class GameBoardUtil {

    private Ladders  ladders;
    private Snakes snakes;
    private Player players;
    private Dice dice;
    private final int maxBoardCell = 100;

    public GameBoardUtil(int numberOfLadders, List<List<Integer>> ladderPositions,
                         int numberOfSnakes, List<List<Integer>> snakePositions,
                         int numberOfPlayers, List<String> playerNames,
                         int diceNumber)
            throws Exception {
        this.ladders = new Ladders(numberOfLadders);
        this.snakes = new Snakes(numberOfSnakes);
        this.players = new Player(numberOfPlayers);
        this.dice = new Dice(diceNumber);
        setLadderPositionsMap(ladderPositions);
        setSnakePositionsMap(snakePositions);
        setPlayersNames(playerNames);
    }


    public static GameBoardUtil
    getBoardInstance(int numberOfLadders, List<List<Integer>> ladderPositions,
                     int numberOfSnakes, List<List<Integer>> snakePositions,
                     int numberOfPlayers, List<String> playerNames,
                     int diceNumber) throws Exception {
        GameBoardUtil gameBoardUtil = new
                GameBoardUtil(numberOfLadders, ladderPositions,
                numberOfSnakes, snakePositions,
                numberOfPlayers, playerNames,
                diceNumber);

        return gameBoardUtil;
    }

    public Map<Integer, Integer> getLadderPositions() {
        return ladders.getLadderPositionsMap();
    }

    public Map<Integer, Integer> getSnakePositions() {
        return snakes.getSnakePositions();
    }

    public Map<String, Integer> getPlayerScores() {
        return this.players.getPlayerNameAndScoreMap();
    }

    public Integer getPlayerScore(String name) {
        return players.getPlayerNameAndScoreMap().get(name);
    }

    public Integer getDiceRollValue() {
        return dice.getDiceRolledNumber();
    }

    public int getMaxBoardCell() {
        return maxBoardCell;
    }

    public void setLadderPositionsMap(Map<Integer, Integer> positionsMap) {
        this.ladders.setLadderPositionsMap(positionsMap);
    }

    public void setLadderPositionsMap(List<List<Integer>> positionsList) throws LadderPositionLimitationException {
        for (List<Integer> integerList: positionsList) {
            if (! (integerList.size() > 2)) {
                this.ladders.setLadderPositionsMap(integerList.get(0), integerList.get(1));
            } else {
                throw new LadderPositionLimitationException();
            }
        }
    }

    public void setSnakePositionsMap(List<List<Integer>> positionsList) throws SnakePositionLimitationException {
        for (List<Integer> integerList: positionsList) {
            if (! (integerList.size() > 2)) {
                this.snakes.setSnakePositions(integerList.get(0), integerList.get(1));
            } else {
                throw new SnakePositionLimitationException();
            }
        }
    }

    public void setPlayersNames(List<String> playersNames) {
        this.players.initialisePlayersWithInitialScore(playersNames);
    }

    public List<String> getPlayersName() {
        return this.players.getPlayerNames();
    }

    public Integer getNumberOfPlayers() {
        return this.players.getNumberOfPlayers();
    }

    public void setPlayerScores(String name, int score){
        if (this.players.getPlayerNameAndScoreMap().containsKey(name)) {
            this.players.updatePlayerScoreMap(name, score);
        }
    }

}
