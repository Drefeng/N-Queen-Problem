import java.util.Arrays;
import java.util.HashMap;
public class Board{

    private Piece[][] board; 
    private HashMap<String,Integer> algebraic = new HashMap<>();   

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

    public Piece[][] getBoard(){
        return board;
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
        String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h"};
        Integer[] number = {1,2,3,4,5,6,7,8};
        for(int i = 0; i < board.length; i++){
            algebraic.put(letter[i], i);
            algebraic.put(Integer.toString(number[i]), i);
        } 
        System.out.println(algebraic);
    }
}


