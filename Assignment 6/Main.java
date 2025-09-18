/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 6
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println(game);
            System.out.println("Which column would " + game.turn + " like to go in (7 to save, 8 to load, 9 to quit)");
            choice = sc.nextInt();

            if(choice >= 0 && choice <= 6){
                try{
                    game.dropPiece(choice);
                    game.nextTurn();
                }catch(ColumnFull c){
                    System.out.println(c.getMessage() + " try again");
                }
            }else if(choice == 7){
                game.saveGame();
            }else if(choice == 8){
                game.loadGame();
            }
        }while(choice != 9);

    }
}
