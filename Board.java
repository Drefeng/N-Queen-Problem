import java.util.Arrays;
import java.util.HashMap;
public class Board{

    private Piece[][] board;    

    public Board(int size){
         board = new Piece[size][size];
    
    }

    public Piece[][] getBoard() {
        return board;
    }

    public Piece getPieceAt(int x, int y) {
        if (x >= 0 && x < board.length && y >= 0 && y < board.length)
            return board[x][y];
        
        return null;
    }

    public boolean isOccupied(Piece piece) {
        if(board[piece.position.getX()][piece.position.getY()] != null)
            return true;
        return false;
    }

    public void markPiece(Piece piece){
        if (!isOccupied(piece))
            board[piece.position.getX()][piece.position.getY()] = piece;
        else
            System.out.println("Occupied");

    }


    public void drawBoard(){
        System.out.println("------------------");
        for(int x=0; x < board.length; x++){
            for(int y=0; y < board.length; y++){
                if(board[x][y] != null){
                    System.out.print(board[x][y]);
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public void indexConverter(){

    }
}


