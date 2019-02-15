import java.util.Arrays;

public class Board{

    private Piece[][] board; 
     
    public Board(int size){
         board = new Piece[size][size];
    
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

}
