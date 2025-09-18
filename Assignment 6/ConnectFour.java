import java.io.*;
import java.util.Scanner;

public class ConnectFour{
    private final char[][] board = new char[6][7];
    public String turn;
    private char token;

    ConnectFour(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                board[i][j] = ' ';
            }
        }
        turn = "Red";
        token = 'R';
    }

    public void nextTurn(){
        if(turn.equals("Red")){
            turn = "Yellow";
            token = 'Y';
        }else{
            turn = "Red";
            token = 'R';
        }
    }

    public int nextAvailablePosition(int column){
        for(int i = 5; i >= 0; i--){
            if(board[i][column] == ' '){
                return i;
            }
        }
        return -1;
    }

    public void dropPiece(int column) throws ColumnFull{
        int row = nextAvailablePosition(column);
        if(row == -1){
            throw new ColumnFull("That column is full");
        }
        board[row][column] = token;
    }

    @Override
    public String toString(){
        String to_return = "  0   1   2   3   4   5   6";
        for(int i = 0; i < 6; i++){
            to_return += "\n-----------------------------\n";
            to_return += "| ";
            for(int j = 0; j < 7; j++) {
                to_return += board[i][j] + " | ";
            }
        }
        to_return += "\n-----------------------------\n";
        return to_return;
    }

    public void saveGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a filename:");
        String fN = sc.nextLine();
        try(PrintWriter writer = new PrintWriter(new File(fN))){
            for(int i = 0; i < 6; i++){
                for(int j = 0; j < 7; j++){
                    writer.print(board[i][j]);
                    if(j < 6) writer.print(",");
                }
                writer.println();
            }
        }catch(FileNotFoundException e){
            System.out.println("Error saving the game: " + e.getMessage());
        }
    }

    public void loadGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String fN2 = sc.nextLine();
        try(BufferedReader reader = new BufferedReader(new FileReader(fN2))){
            for(int i = 0; i < 6; i++){
                String[] token = reader.readLine().split(",");
                for(int j = 0; j < 7; j++){
                    board[i][j] = token[j].charAt(0);
                }
            }
        }catch(IOException e){
            System.out.println("Unable to read that file");
        }
    }
}
