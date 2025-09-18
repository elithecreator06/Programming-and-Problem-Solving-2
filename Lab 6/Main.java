/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 6
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        number = sc.nextInt();

        FibFormula myFibF = new FibFormula();
        FibIteration myFibI = new FibIteration();

        System.out.println("Fib of " + number + " by iteration is: " + myFibI.calculate_fib(number));
        System.out.println("Fib of " + number + " by formula is: " + myFibF.calculate_fib(number));


    }
}