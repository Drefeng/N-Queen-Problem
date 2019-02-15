public abstract class Piece {
    protected Point position;

    public Piece(int x, int y) {
        position = new Point(x, y);
        position.setX(x);
        position.setY(y);
    }   
}