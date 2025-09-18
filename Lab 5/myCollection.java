/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 5
*/

import java.util.Scanner;
public class myCollection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice;
        String title;
        String author;
        long isbn;
        int issue;

        Item[] infoStore = new Item[5];

        for(int i = 0; i < infoStore.length; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            choice = sc.next().charAt(0);
            if (choice == 'B' || choice == 'b') {
                sc.nextLine();
                System.out.println("Please enter the name of the Book");
                title = sc.nextLine();
                System.out.println("Please enter the author of the Book");
                author = sc.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                isbn = sc.nextLong();
                Book newBook = new Book(title, isbn, author);
                infoStore[i] = newBook;
            } else if (choice == 'P' || choice == 'p') {
                sc.nextLine();
                System.out.println("Please enter the name of Periodical");
                title = sc.nextLine();
                System.out.println("Please enter the issue number");
                issue = sc.nextInt();
                Periodical newPeriodical = new Periodical(title, issue);
                infoStore[i] = newPeriodical;
            }

        }
        System.out.println();

        System.out.println("Your Items: ");
        for(int j = 0; j < infoStore.length; j++){
            System.out.println(infoStore[j].getListing());
            System.out.println();
        }
    }
}
