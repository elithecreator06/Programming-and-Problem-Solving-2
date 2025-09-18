/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 7B
*/

import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String l = "I must study recursion until it makes sense\n";
        String s1;
        String s2;
        int t = 100;
        String r = repeatNTimes(l, t);

        System.out.println(r);

        System.out.println("Enter the first string");
        s1 = sc.nextLine();
        System.out.println("Enter the second string");
        s2 = sc.nextLine();

        if(isReverse(s1, s2)){
            System.out.println(s1 + " is the reverse of " + s2);
        }else if(!isReverse(s1, s2)){
            System.out.println(s1 + " is not the reverse of " + s2);
        }
    }











    public static String repeatNTimes(String s, int a){
        if(a == 0){
            return "";
        }
        return s + repeatNTimes(s, a - 1);
    }

    public static boolean isReverse(String a, String b){
        int x = a.length();
        int y = b.length();

        if(a.isEmpty() && b.isEmpty()){
            return true;
        }else if(x != y){
            return false;
        }

        char x1 = a.charAt(0);
        char y1 = b.charAt(y-1);
        if(x1 == y1){
            return isReverse(a.substring(1), b.substring(0, y - 1));
        }else{
            return false;
        }
    }
}
