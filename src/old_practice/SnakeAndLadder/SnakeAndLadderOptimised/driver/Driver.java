package old_practice.SnakeAndLadder.SnakeAndLadderOptimised.driver;

import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.service.board.Board;
import old_practice.SnakeAndLadder.SnakeAndLadderOptimised.service.board.implementation.BoardImplementation;

public class Driver {

    public static void main(String[] args) {
         Board gameBoard =  new BoardImplementation();

         gameBoard.play();

    }

}
