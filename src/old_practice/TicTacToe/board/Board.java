package old_practice.TicTacToe.board;

import old_practice.TicTacToe.exceptions.InvalidCoordinateException;
import old_practice.TicTacToe.exceptions.InvalidPlayerException;
import old_practice.TicTacToe.exceptions.PositionOccupiedException;
import old_practice.TicTacToe.player.Player;

public class Board implements BoardInterface{
    private final  int[][] board;
    int[] rowCount;
    int[] columnCount;
    int diagonalCount;
    int reverseDiagonalCount;
    int boardSize;
    Player winner;

    public Board(int n ) {
        this.board = new int[n][n];
        rowCount = new int[n];
        columnCount = new int[n];
        diagonalCount = 0;
        reverseDiagonalCount = 0;
        int boardSize = n;
    }

    @Override
    public Player makeMove(Player player, int row, int column) throws Exception {
        if (row < 0 || column < 0 || row > boardSize || column > boardSize) {
            throw new InvalidCoordinateException();
        }else if (board[row][column] != 0) {
            throw new PositionOccupiedException();
        } else if (!player.equals(Player.O) && !player.equals(Player.X)) {
            throw new InvalidPlayerException();
        }
            int playerValue = player == Player.O? -1: +1;
            board[row][column] = playerValue;
            rowCount[row] += playerValue;
            columnCount[column] = playerValue;
            if (row == column) {
                diagonalCount+= playerValue;
            }
            if (row == boardSize - 1 - column) {
                reverseDiagonalCount += playerValue;
            }
            if (rowCount[row] == Math.abs(boardSize) ||
                    columnCount[column] == Math.abs(boardSize) ||
                    diagonalCount == Math.abs(boardSize) ||
                    reverseDiagonalCount == Math.abs(boardSize) ) {
                this.winner = player;
            }
            // some comment
            return getWinner();
    }

    @Override
    public Player getWinner() {
        return this.winner;
    }
}
