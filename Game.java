import java.util.Scanner;

public class Game {
    private Board board;
    private Queen queen;

    private Scanner keyboard;

    public Game(){
        //board = new Board();
        keyboard = new Scanner(System.in);
        board = new Board(8);
    }

    public void gameStart(){
        boolean start = true;
        String choice;
        System.out.println("\t..Welcome to the 8 Queen Problem..");
        System.out.println("Printing board....");
        board.drawBoard();
        while(start) {
            start = true;
            choice = keyboard.next();
            
            if(checkCharacter(choice.substring(0,1)) && checkNumbers(Integer.parseInt(choice.substring(1)))){
                System.out.println("Hello");
            }else{
                System.out.println("Wrong input!!! \nMust be \nExample: a1 to g8");
            }
        }
    }

    //Helper method for checking characters
    public boolean checkCharacter(String input) {
        String[] character = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for(int i = 0; i < character.length; i++) {
            if(character[i].equalsIgnoreCase(input)){
                return true;
            }
        }
        return false;
    }

    //Helper methods for checking numbers
    public boolean checkNumbers(int num) {
        int [] number = {1,2,3,4,5,6,7,8};

        for(int i = 0; i < number.length; i++) {
            if(number[i] == num) {
                return true;
            }
        }
        return false;
    }
}