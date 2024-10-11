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

        board[7][1] = new Bishop("Sente", new Position(7, 1));
        board[1][7] = new Bishop("Gote", new Position(1, 7));
        board[7][7] = new Rook("Sente", new Position(7, 7));
        board[1][1] = new Rook("Gote", new Position(1, 1));

        board[8][0] = new Lance("Sente", new Position(8, 0));
        board[8][8] = new Lance("Sente", new Position(8, 8));
        board[0][0] = new Lance("Gote", new Position(0,0));
        board[0][8] = new Lance("Gote", new Position(0, 8));

        board[8][1] = new Knight("Sente", new Position(8, 1));
        board[8][7] = new Knight("Sente", new Position(8, 7));
        board[0][1] = new Knight("Gote", new Position(0,1));
        board[0][7] = new Knight("Gote", new Position(0, 7));

        board[8][2] = new Silver("Sente", new Position(8, 2));
        board[8][6] = new Silver("Sente", new Position(8, 6));
        board[0][2] = new Silver("Gote", new Position(0,2));
        board[0][6] = new Silver("Gote", new Position(0, 6));

        board[8][3] = new Gold("Sente", new Position(8, 3));
        board[8][5] = new Gold("Sente", new Position(8, 5));
        board[0][3] = new Gold("Gote", new Position(0,2));
        board[0][5] = new Gold("Gote", new Position(0, 5));

        board[8][4] = new King("Sente", new Position(8, 4));
        board[0][4] = new King("Gote", new Position(0, 4));
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
