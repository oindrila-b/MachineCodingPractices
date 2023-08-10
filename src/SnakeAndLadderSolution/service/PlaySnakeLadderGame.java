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

    public int getPlayersLatestScore(String playerName) {
        return  gameBoardUtil.getPlayerScore(playerName);
    }

    public boolean isPlayersCurrentScore99(int score) {
        return  score==99;
    }

    public Integer checkAndReturnIfPlayerFindsLadder(int startPosition) {
        if (gameBoardUtil.getLadderPositions().containsKey(startPosition)) {
           return gameBoardUtil.getLadderPositions().get(startPosition);
        }
        return -1;
    }

    public Integer checkAndReturnIfPlayerFindsSnake(int startPosition) {
        if (gameBoardUtil.getSnakePositions().containsKey(startPosition)) {
            return gameBoardUtil.getSnakePositions().get(startPosition);
        }
        return -1;
    }

    public void playSnakeAndLadder(){
        while (!hasAnyPlayerWon()) {
            for (int i = 0; i < gameBoardUtil.getNumberOfPlayers(); i++) {
                int rolledDiceValue = gameBoardUtil.getDiceRollValue();
                String string = "";
                String currentPlayerName = gameBoardUtil.getPlayersName().get(i);
                int previousPosition = gameBoardUtil.getPlayerScore(currentPlayerName);
                int newPosition = previousPosition + rolledDiceValue;
                if (checkAndReturnIfPlayerFindsSnake(newPosition) != null) {
                    int snakeEndPosition = gameBoardUtil.getSnakePositions().get(newPosition);
                    gameBoardUtil.setPlayerScores(currentPlayerName,snakeEndPosition);
                    System.out.println(currentPlayerName + " rolled a dice value "
                            + rolledDiceValue + " and encountered snake, so moved from " +
                            previousPosition + " to " + snakeEndPosition);
                }
                else if (checkAndReturnIfPlayerFindsLadder(newPosition) != null) {
                    int ladderEndPosition = gameBoardUtil.getLadderPositions().get(newPosition);
                    gameBoardUtil.setPlayerScores(currentPlayerName,ladderEndPosition);
                    System.out.println(currentPlayerName + " rolled a dice value "
                            + rolledDiceValue + " and encountered ladder, so moved from " +
                            previousPosition + " to " + ladderEndPosition);
                } else {
                    gameBoardUtil.setPlayerScores(currentPlayerName,newPosition);
                    System.out.println(currentPlayerName + " rolled a dice value "
                            + rolledDiceValue + " and moved from " +
                            previousPosition + " to " + newPosition);
                }

            }
        }
    }

    public boolean hasAnyPlayerWon() {
       if (gameBoardUtil.getPlayerScores().containsValue(100)) {
           return true;
       }
       return false;
    }


}
