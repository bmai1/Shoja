package shoja;

public abstract class Piece {
    protected String side;
    protected Position position;

    public Piece(String side, Position position) {
        this.side = side;
        this.position = position;
    }

    public void move() {
        
    }

    public void capture() {

    }

    public void place() {
        // place a piece from hand in valid space
    }

    public void promote() {
        // if not bishop, rook, or king, promote into gold general upon moving past mid line
    }

}
