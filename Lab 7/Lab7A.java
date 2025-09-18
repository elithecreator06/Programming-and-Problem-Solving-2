/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 7A
*/

import java.util.Scanner;
public class Lab7A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice;

        do{
            int x = 0;
            int y = 0;

            System.out.println("""
                Choose from the following:
                0. Quit
                1. Multiply 2 numbers
                2. Div 2 numbers
                3. Mod 2 numbers""");
            choice = sc.nextInt();
            if(choice != 0){
                System.out.println("Enter first number");
                x = sc.nextInt();
                System.out.println("Enter second number");
                y = sc.nextInt();
            }

            if(choice == 1){
                System.out.println("Answer: " + recursive_multiply(x, y));
            }else if(choice == 2){
                System.out.println("Answer: " + recursive_div(x, y));
            }else if(choice == 3){
                System.out.println("Answer: " + recursive_mod(x, y));
            }
        }while(choice != 0);

    }


    public static int recursive_multiply(int x, int y){
        if(y == 0){
            return 0;
        }else{
            return x + recursive_multiply(x, y - 1);
        }
    }

    public static int  recursive_div(int x, int y){
        if(y == 0){
            return -1;
        }else if(x == y){
            return 1;
        }else if(x < y){
            return 0;
        }else{
            return 1 + recursive_div(x - y, y);
        }
    }

    public static int recursive_mod(int x, int y){
        if(y == 0){
            return -1;
        }else if(x < y){
            return x;
        }else{
            return y - recursive_mod(x - y, y);
        }
    }
}
