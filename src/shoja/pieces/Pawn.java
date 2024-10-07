package shoja.pieces;

import shoja.Piece;
import shoja.Position;

public class Pawn extends Piece {

    public Pawn(String side, Position position) { 
        super(side, position);
    }

    @Override
    public void move() {

    }

    @Override
    public void capture() {}

    @Override
    public void place() {}

    @Override
    public void promote() {}
}
