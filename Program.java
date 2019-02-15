public class Program {
    public static void main(String[] args) {
       /* Game game = new Game();
        game.gameStart();*/
        Board board = new Board(8);
        board.drawBoard();
        board.markPiece(new Queen(2, 2));
        board.drawBoard();

        board.markPiece(new Queen(2, 2));
        board.markPiece(new Queen(5, 3));
        board.drawBoard();

        System.out.println(((Queen)board.getPieceAt(5, 3)).isValid(board, 5, 0));

    }
}