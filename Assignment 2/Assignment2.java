/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 2
*/

import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args){
        English eng = new English();
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int letterCount, choice;
        String input;

        System.out.println("How many letters are in the word?");
        letterCount = sc.nextInt();

        System.out.println("""
                Do you want me to look for letters or a pattern?
                1. Letters
                2. Pattern""");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("What letters are in the word?");
            input = scan.nextLine();
            guessWordWithLetters(eng, letterCount, input);
        }else if(choice == 2){
            System.out.println("What pattern is in the word?");
            input = scan.nextLine();
            guessWordWithPattern(eng, letterCount, input);
        }
    }


    public static boolean wordContainsLetter(String word, char letter){
        for(char l : word.toCharArray()){
            if(l == letter){
                return true;
            }
        }
        return false;
    }

    public static boolean wordContainsString(String word1, String word2){
        if(word1.contains(word2)){
            return true;
        }else{
            return false;
        }
    }

    public static void guessWordWithLetters(English eng, int len, String let){
        System.out.println("It may be any of these...");
        for(String word : eng.words){
            if(word.length() == len){
                boolean flag = true;
                for(char l : let.toCharArray()){
                    if(!wordContainsLetter(word,l)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(word);
                }
            }
        }
    }

    public static void guessWordWithPattern(English eng, int len, String pat){
        System.out.println("It may be any of these...");
        for(String word : eng.words){
            if(word.length() == len){
                if(wordContainsString(word, pat)){
                    System.out.println(word);
                }
            }
        }
    }
}
