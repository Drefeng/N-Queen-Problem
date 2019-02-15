public class Program {
    public static void main(String[] args) {
        Board board = new Board(8);

        board.markPiece(new Queen(0,2));
        board.drawBoard();

        if (board.solve(0) == false) {
            System.out.println("No solution");
        } else {
            System.out.println("Solution: ");
            board.drawBoard();
        }
    }
}