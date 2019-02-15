public class Program {
    public static void main(String[] args) {
<<<<<<< HEAD
        Game game = new Game();

        game.gameStart();
=======
       /* Game game = new Game();
        game.gameStart();*/
        Board board = new Board(8);
        board.drawBoard();
        board.indexConverter();
>>>>>>> f73f9da9e3ba312216e0ed4660a01195dd401d2b
    }
}