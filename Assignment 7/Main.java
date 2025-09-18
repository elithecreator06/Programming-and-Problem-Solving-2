/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 7
*/

import java.util.Random;

public class Main {
    public static void main(String[] args){
        final int MAX = 10000;
        Prime primeObj = new Prime(MAX);
        Random rand = new Random();
        int randNum;

        do{
            randNum = rand.nextInt(MAX);
        }while(randNum < 2 || primeObj.isPrime(randNum));

        System.out.println("What primes make up " + randNum + "?");

        while(randNum >= 2){
            int fact = findFactor(randNum, primeObj);
            if(fact == -1){
                break;
            }
            System.out.print(fact);
            randNum /= fact;
            if(randNum >= 2){
                System.out.print("x");
            }
        }
        System.out.println();
    }

    public static int findFactor(int target, Prime primeObj){
        for(int i = 0; i < primeObj.primes.size(); i++){
            int prime = primeObj.getPrime(i);
            if(target % prime == 0){
                return prime;
            }
        }
        return -1;
    }
}