package TicTacToe.board;

import TicTacToe.exceptions.InvalidCoordinateException;
import TicTacToe.player.Player;

public interface BoardInterface {

    Player makeMove(Player player, int row, int column) throws Exception;

    Player getWinner();

}
