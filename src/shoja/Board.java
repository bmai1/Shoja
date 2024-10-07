package shoja;

import shoja.pieces.*;

public class Board {
    private Piece[][] board;

    
    public Board() {
        board = new Piece[9][9];

        for (int i = 0; i < 9; ++i) {
            board[6][i] = new Pawn("Sente", new Position(6, i));
            board[2][i] = new Pawn("Gote", new Position(2, i));
        }


    }

    public boolean mate() {
        // if (King.check() && King.move() == false) {
        //     return true;
        // }
        return false;
    }


    public void updateBoard(Piece piece) {
        board[piece.gePosition().getRow()][piece.gePosition().getCol()] = piece;
    }

    public Piece[][] getBoard() {
        return board;
    }
}
