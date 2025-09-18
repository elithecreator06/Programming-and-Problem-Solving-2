/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 2
*/

import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);

        int choice;
        float prices;
        int quantity;

        do{
            System.out.print("""
                    1. Sold One Milk
                    2. Sold One Bread
                    3. Change price of Milk
                    4. Change price of Bread
                    5. Add Milk to Inventory
                    6. Add Bread to Inventory
                    7. See Inventory
                    8. Quit""");
            System.out.println();
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    milk.lowerQuantity(1);
                    break;

                case 2:
                    bread.lowerQuantity(1);
                    break;

                case 3:
                    System.out.println("WHat is the new price for Milk");
                    prices = sc.nextFloat();
                    milk.setPrice(prices);
                    break;

                case 4:
                    System.out.println("What is the new price for Bread");
                    prices = sc.nextFloat();
                    bread.setPrice(prices);
                    break;

                case 5:
                    System.out.println("How many milk did we get?");
                    quantity = sc.nextInt();
                    milk.raiseQuantity(quantity);
                    break;

                case 6:
                    System.out.println("How many bread did we get?");
                    quantity = sc.nextInt();
                    bread.raiseQuantity(quantity);
                    break;

                case 7:
                    System.out.println("Milk: " + milk);
                    System.out.println("Bread: " + bread);
            }
            System.out.println();
        }while(choice != 8);

    }
}
