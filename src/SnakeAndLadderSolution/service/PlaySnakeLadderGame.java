package SnakeAndLadderSolution.service;

import SnakeAndLadderSolution.utils.GameBoardUtil;

import java.util.Map;

public class PlaySnakeLadderGame {

    private GameBoardUtil gameBoardUtil;
    private Map<String, Integer> playerScoreHistory;


    public PlaySnakeLadderGame(GameBoardUtil gameBoardUtil) {
        try {
            this.gameBoardUtil = gameBoardUtil;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getPlayersLatestScore(String playerName) {
        return  gameBoardUtil.getPlayerScore(playerName);
    }

    private boolean isPlayersCurrentScoreLessThan100(int score) {
        return  score<100;
    }

    private Integer checkAndReturnIfPlayerFindsLadder(int startPosition) {
        if (gameBoardUtil.getLadderPositions().containsKey(startPosition)) {
            return gameBoardUtil.getLadderPositions().get(startPosition);
        }
        return -1;
    }

    private Integer checkAndReturnIfPlayerFindsSnake(int startPosition) {
        if (gameBoardUtil.getSnakePositions().containsKey(startPosition)) {
            return gameBoardUtil.getSnakePositions().get(startPosition);
        }
        return -1;
    }

    public void playSnakeAndLadder() {
        while (!hasAnyPlayerWon()) {
            for (int i = 0; i < gameBoardUtil.getNumberOfPlayers(); i++) {
                int rolledDiceValue = gameBoardUtil.getDiceRollValue();
                String currentPlayerName = gameBoardUtil.getPlayersName().get(i);
                int playersPreviousScore = getPlayersLatestScore(currentPlayerName);
                System.out.println(playersPreviousScore);
                int playersNewScore = playersPreviousScore + rolledDiceValue;
                System.out.println(playersNewScore);
                if (checkAndReturnIfPlayerFindsLadder(playersNewScore) != -1){
                    int ladderEndPosition = checkAndReturnIfPlayerFindsLadder(playersNewScore);
                    gameBoardUtil.setPlayerScores(currentPlayerName, ladderEndPosition);
                    System.out.println(currentPlayerName + " rolled a dice value of " + rolledDiceValue + " and moved from " + playersPreviousScore+ " to "+ playersNewScore +
                            " where he encountered a ladder and thus moved from " + playersNewScore + " to " +ladderEndPosition );
                    if (ladderEndPosition == 100){
                        System.out.println(currentPlayerName + " has won the match!");
                        return;
                    }
                } else if (checkAndReturnIfPlayerFindsSnake(playersNewScore) != -1){
                    int snakeEndPosition = checkAndReturnIfPlayerFindsSnake(playersNewScore);
                    gameBoardUtil.setPlayerScores(currentPlayerName, snakeEndPosition);
                    System.out.println(currentPlayerName + " rolled a dice value of " + rolledDiceValue + " and encountered a snake from the new position " + playersNewScore+
                            " and thus moved from " + playersNewScore + " to " +snakeEndPosition );
                    if (snakeEndPosition == 100){
                        System.out.println(currentPlayerName + " has won the match!");
                        return;
                    }
                }else {
                    gameBoardUtil.setPlayerScores(currentPlayerName, playersNewScore);
                    System.out.println(currentPlayerName + " rolled a dice value of " + rolledDiceValue + " and moved from " + playersPreviousScore + " to " + playersNewScore);
                    if (playersNewScore == 100){
                        System.out.println(currentPlayerName + " has won the match!");
                        return;
                    }
                }
            }
        }
    }

    private boolean hasAnyPlayerWon() {
        return gameBoardUtil.getPlayerScores().containsValue(100);
    }

}
