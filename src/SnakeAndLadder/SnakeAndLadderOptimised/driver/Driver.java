package SnakeAndLadder.SnakeAndLadderOptimised.driver;

import SnakeAndLadder.SnakeAndLadderOptimised.service.board.Board;
import SnakeAndLadder.SnakeAndLadderOptimised.service.board.implementation.BoardImplementation;

public class Driver {

    public static void main(String[] args) {
         Board gameBoard =  new BoardImplementation();

         gameBoard.play();

    }

}
