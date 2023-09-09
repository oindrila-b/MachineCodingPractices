package SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.driver;

import SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.service.PlaySnakeLadderGame;
import SnakeAndLadder.SnakeAndLadderOptimised.SnakeAndLadderSolution.utils.GameBoardUtil;

import java.util.ArrayList;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) throws Exception {
        // CAN USE PAIRS

        //ladders
        List<List<Integer>> ladderPositions = new ArrayList<>();
        List<Integer> ladder1 = new ArrayList<>();
        ladder1.add(2);
        ladder1.add(37);
        List<Integer> ladder2 = new ArrayList<>();
        ladder2.add(27);
        ladder2.add(46);
        List<Integer> ladder3 = new ArrayList<>();
        ladder3.add(10);
        ladder3.add(32);
        List<Integer> ladder4 = new ArrayList<>();
        ladder4.add(51);
        ladder4.add(68);
        List<Integer> ladder5 = new ArrayList<>();
        ladder5.add(61);
        ladder5.add(79);
        List<Integer> ladder6 = new ArrayList<>();
        ladder6.add(65);
        ladder6.add(84);
        List<Integer> ladder7 = new ArrayList<>();
        ladder7.add(71);
        ladder7.add(91);
        List<Integer> ladder8 = new ArrayList<>();
        ladder8.add(81);
        ladder8.add(100);

        ladderPositions.add(ladder1);
        ladderPositions.add(ladder2);
        ladderPositions.add(ladder3);
        ladderPositions.add(ladder4);
        ladderPositions.add(ladder5);
        ladderPositions.add(ladder6);
        ladderPositions.add(ladder7);
        ladderPositions.add(ladder8);

        //snakes
        List<List<Integer>> snakePositions = new ArrayList<>();
        List<Integer> snake1 = new ArrayList<>();
        snake1.add(62);
        snake1.add(5);
        List<Integer> snake2 = new ArrayList<>();
        snake2.add(33);
        snake2.add(6);
        List<Integer> snake3 = new ArrayList<>();
        snake3.add(49);
        snake3.add(9);
        List<Integer> snake4 = new ArrayList<>();
        snake4.add(88);
        snake4.add(16);
        List<Integer> snake5 = new ArrayList<>();
        snake5.add(41);
        snake5.add(20);
        List<Integer> snake6 = new ArrayList<>();
        snake6.add(56);
        snake6.add(53);
        List<Integer> snake7 = new ArrayList<>();
        snake7.add(98);
        snake7.add(64);
        List<Integer> snake8 = new ArrayList<>();
        snake8.add(95);
        snake8.add(75);
        List<Integer> snake9 = new ArrayList<>();
        snake9.add(93);
        snake9.add(73);

        snakePositions.add(snake1);
        snakePositions.add(snake2);
        snakePositions.add(snake3);
        snakePositions.add(snake4);
        snakePositions.add(snake5);
        snakePositions.add(snake6);
        snakePositions.add(snake7);
        snakePositions.add(snake8);
        snakePositions.add(snake9);

        List<String> players = new ArrayList<>();
        players.add("Sourav");
        players.add("Arun");
        players.add("Alina");

        final GameBoardUtil gameBoardUtil = new GameBoardUtil(
                8,
                ladderPositions,
                9,
                snakePositions,
                3,
                players,
                6 );
        PlaySnakeLadderGame playSnakeLadderGame = new PlaySnakeLadderGame(gameBoardUtil);
        playSnakeLadderGame.playSnakeAndLadder();
    }
}
