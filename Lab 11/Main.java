/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 11
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        BlueRayCollection collection = new BlueRayCollection();

        int choice;
        String title;
        String director;
        int yearOfRelease;
        double cost;

        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("""
                0. Quit
                1. Add BlueRay to collection
                2. See collection""");
            choice = sc.nextInt();


            if(choice == 1){
                System.out.println("What is the title?");
                title = scan.nextLine();
                System.out.println("What is the director?");
                director = scan.nextLine();
                System.out.println("What is the year of release?");
                yearOfRelease = sc.nextInt();
                System.out.println("What is the cost?");
                cost = sc.nextDouble();

                collection.add(title, director, yearOfRelease, cost);
                System.out.println();
            }else if(choice == 2){
                collection.show_all();
                System.out.println();
            }
        }while(choice != 0);

    }
}
