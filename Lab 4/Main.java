/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 4
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double moneyChoice;
        double balance;
        int accountNum;
        Account customer1 = new Account();
        Checking customer1C = new Checking(0);
        Savings customer1S = new Savings(0);

        do{
            System.out.println("""
                    1. Withdraw from Checking
                    2. Withdraw from Savings
                    3. Deposit to Checking
                    4. Deposit to Savings
                    5. Balance of Checking
                    6. Balance of Savings
                    7. Award Interest to Savings now
                    8. Quit""");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    moneyChoice = sc.nextDouble();
                    customer1C.withdrawal(moneyChoice);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    moneyChoice = sc.nextDouble();
                    customer1S.withdrawal(moneyChoice);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    moneyChoice = sc.nextDouble();
                    System.out.println("Doing default deposit");
                    customer1C.deposit(moneyChoice);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    moneyChoice = sc.nextDouble();
                    customer1S.deposit(moneyChoice);
                    break;
                case 5:
                    balance = customer1C.getAccountBalance();
                    accountNum = customer1C.getAccountNumber();
                    System.out.println("Your balance for checking " + accountNum + " is " + balance);
                    break;
                case 6:
                    balance = customer1S.getAccountBalance();
                    accountNum = customer1S.getAccountNumber();
                    System.out.println("Your balance for savings " + accountNum + " is " + balance);
                    break;
                case 7:
                    customer1S.interest();
                    break;
            }
        }while(choice != 8);
    }
}