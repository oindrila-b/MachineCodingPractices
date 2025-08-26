package old_practice.TicTacToe.board;

import old_practice.TicTacToe.player.Player;

public interface BoardInterface {

    Player makeMove(Player player, int row, int column) throws Exception;

    Player getWinner();

}
