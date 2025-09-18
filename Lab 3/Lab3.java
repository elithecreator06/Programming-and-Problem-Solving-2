/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 3
*/

import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice;
        Quiz userQuiz = new Quiz();
        do{
            System.out.println("""
                    What would you like to do?
                    1. Add a question to the quiz
                    2. Remove a question from the quiz
                    3. Modify a question in the quiz
                    4. Take the quiz
                    5. Quit""");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    userQuiz.add_question();
                    break;
                case 2:
                    userQuiz.remove_question();
                    break;
                case 3:
                    userQuiz.modify_question();
                    break;
                case 4:
                    userQuiz.give_quiz();
                    break;
            }
        }while(choice != 5);
    }
}
