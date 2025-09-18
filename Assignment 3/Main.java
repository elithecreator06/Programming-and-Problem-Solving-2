/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 3
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pokedex myDex = new Pokedex();

        char choice;

        do{
            boolean pokemonCaught = false;
            Pokemon p = spawn();
            do{
                float cpm = 0.49985844f;
                float multiplier = throwBall();
                float catchProbability = (float) (1f - Math.pow((1f-(p.getBaseCatchRate()/(2f * cpm))), multiplier));
                float randPro = new Random().nextFloat();

                if(randPro < catchProbability){
                    myDex.addToDex(p);
                    System.out.println(p.toString() + " caught");
                    pokemonCaught = true;
                }else{
                    System.out.println("Oops " + p.toString() + " jumped out, try again!");
                }
            }while(!pokemonCaught);

            System.out.println("Continue Catching Pokemon? (Y or N)");
            choice = scan.next().charAt(0);
        }while(choice == 'Y');

        System.out.println("You have the following pokemon: ");
        System.out.println(myDex.toString());
    }


    public static Pokemon spawn(){
        Pokemon p;
        int randLevel = new Random().nextInt(0, 20);
        int randPoke = new Random().nextInt(0, 3);

        if(randPoke == 1){
            p = new Bulbasaur(randLevel);
        }else if (randPoke == 2){
            p = new Charmander(randLevel);
        }else{
            p = new Caterpie(randLevel);
        }

        System.out.println("You encountered " + p.toString());
        return p;
    }

    public static float throwBall(){
        Scanner sc = new Scanner(System.in);
        String typeB, berry, choice;
        float ballMultiplier, berryMultiplier, curveMultiplier;

        System.out.println("What type of ball do you wish to use? (Poke, Great, Ultra)");
        typeB = sc.nextLine();

        if(typeB.equals("Poke")){
            ballMultiplier = 1.0f;
        } else if(typeB.equals("Great")){
            ballMultiplier = 1.5f;
        }else{
            ballMultiplier = 2.0f;
        }


        System.out.println("What berry do yo wish to use? (None, Razz, SilverPinap, GoldenRazz)");
        berry = sc.nextLine();

        if(berry.equals("Razz")){
            berryMultiplier = 1.5f;
        }else if(berry.equals("SilverPinap")){
            berryMultiplier = 1.8f;
        }else if(berry.equals("GoldenRazz")){
            berryMultiplier = 2.5f;
        }else{
            berryMultiplier = 1.0f;
        }


        System.out.println("Is this a curveball? (Yes or No)");
        choice = sc.nextLine();

        if(choice.equals("Yes")){
            curveMultiplier = 1.7f;
        }else{
            curveMultiplier = 1.0f;
        }

        float value = ballMultiplier * berryMultiplier * curveMultiplier;
        return value;
    }
}