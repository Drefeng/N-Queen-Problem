import java.util.Scanner;

public class Game {
    //private Board board;
    //private Queen queen;

    private Scanner keyboard;


    public Game(){
        //board = new Board();
        keyboard = new Scanner(System.in);
    }

    public void gameStart(){
        boolean start = true;
        String choice;
        System.out.println("\t..Welcome to the 8 Queen Problem..");
        while(start) {
            start = true;
            choice = keyboard.nextLine();
            switch(choice) {
                case "yes":
                System.exit(0);
                break;
                case "no":
                System.out.println("You did it!");
                default:
                System.out.println("Please choose between yes or no!");
                break;
            }
        }
    }
}