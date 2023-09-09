package SnakeAndLadderOptimised.service.board.implementation;

import SnakeAndLadderOptimised.models.implementations.Player;
import SnakeAndLadderOptimised.service.board.Board;
import SnakeAndLadderOptimised.utils.assetInitializer.BoardAssetInitializer;
import SnakeAndLadderOptimised.utils.assetInitializer.implementations.BoardInitializerImplementation;
import SnakeAndLadderOptimised.utils.dice.Dice;

import java.util.List;

public class BoardImplementation implements Board {

    private  BoardAssetInitializer boardAssetInitializer;
    private Integer maxPositionOnBoard;
    private List<Player> playerList;
    private boolean isPlayerScoreHundred;
    private Dice dice;

    public BoardImplementation() {
        boardAssetInitializer = new BoardInitializerImplementation();
        boardAssetInitializer.instantiateEntities();
        dice = boardAssetInitializer.getDice();
        maxPositionOnBoard = 100;
    }

    @Override
    public void play() {
        this.playerList = boardAssetInitializer.getPlayersList();
        while (!isPlayerScoreHundred) {
            for (Player p:playerList) {
                System.out.println(p.getPlayerName() + "'s turn!");
                    Integer score = dice.rollDice();
                    String playerName = p.getPlayerName();
                    Integer playerCurrentScore = p.getPlayerScore();
                    Integer addedScore = (playerCurrentScore + score);
                    if (!isScoreHundred(addedScore)) {
                        if (returnNewSnakeScore(addedScore) != -1) {
                            Integer updatedScore = returnNewSnakeScore(addedScore);
                            System.out.println(playerName + " has rolled a " + score + " and has moved from "+
                                    playerCurrentScore +" to  " + addedScore + " where they encountered a snake and hence moved down to " + updatedScore );
                            p.updatePlayerScore(updatedScore);
                        } else if(returnNewLadderScore(addedScore) != -1) {
                            Integer updatedScore = returnNewLadderScore(addedScore);
                            System.out.println(playerName + " has rolled a " + score + " and has moved from "+
                                    playerCurrentScore +" to  " + addedScore + " where they encountered a ladder and hence moved up to " + updatedScore );
                            p.updatePlayerScore(updatedScore);
                            if (isScoreHundred(updatedScore)) {
                                System.out.println(playerName + " has rolled a value of " + score + " and moved from " + playerCurrentScore + " to " + addedScore + " and has won the match!");
                                p.updatePlayerScore(updatedScore);
                                break;
                            }
                        }else {
                            p.updatePlayerScore(addedScore);
                            System.out.println(playerName + " rolled a " + score + " and moved from " + playerCurrentScore + " to " + addedScore);
                        }
                    } else if (isScoreHundred(addedScore)){
                        System.out.println(playerName + " has rolled a value of " + score + " and moved from " + playerCurrentScore + " to " + addedScore + " and has won the match!");
                        p.updatePlayerScore(addedScore);
                        break;
                }else{
                        System.out.println("New Score after rolling was " + (playerCurrentScore + score) + " which exceeded the maximum board value of " +  maxPositionOnBoard + ". Try again in your next turn." );
                 }
            }
        }
    }

    private boolean isScoreHundred(Integer newScore) {
        if (newScore == 100) {
            isPlayerScoreHundred = true;
            return true;
        }
        return false;
    }

    private boolean hasEncounteredSnake(Integer score){
        return boardAssetInitializer.getSnakePositionsMap().containsKey(score);
    }

    private Integer returnNewSnakeScore(Integer score){
        if (hasEncounteredSnake(score)) {
            return boardAssetInitializer.getSnakePositionsMap().get(score);
        }
        return  -1;
    }

    private boolean hasEncounteredLadder(Integer score){
        return boardAssetInitializer.getLadderPositionsMap().containsKey(score);
    }

    private Integer returnNewLadderScore(Integer score){
        if (hasEncounteredLadder(score)) {
            return boardAssetInitializer.getLadderPositionsMap().get(score);
        }
        return  -1;
    }

}
