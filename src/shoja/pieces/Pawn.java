package shoja.pieces;

import shoja.Board;
import shoja.Piece;
import shoja.Position;


public class Pawn extends Piece {

    public Pawn(String side, Position position) { 
        super(side, position);
    }

    @Override
    public void move(Board board, Position nextPosition) {
        int row = position.getRow();
        int col = position.getCol();

        int nextRow = nextPosition.getRow();
        int nextCol = nextPosition.getCol();

        // can only move forward
        if (nextRow == row + 1 && col == nextCol) {
            
            position.setPosition(row + 1, col);
            board.updateBoard(this);
        }

        // check if passed mid, then prompt to promote
        promote();
    }

    @Override
    public void capture() {}

    @Override
    public void place() {}

    @Override
    public void promote() {}
}
