import java.util.Arrays;
import java.util.HashMap;
public class Board{

    private Piece[][] board;    

    public Board(int size){
         board = new Piece[size][size];
    
    }


    public boolean isOccupied(Piece piece) {
        if(piece != null)
            return true;
        return false;
    }

    public void markPiece(int x, int y, Piece piece){
        board[x][y] = piece;

    }


    public void drawBoard(){

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
    
    }

    public void indexConverter(){

    }
    
    
}


