/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 8
*/

import java.util.Scanner;
public class Main {
    public static int time(String time) throws InvalidTimeException{
        String[] splitTime = time.split(":", 3);
        int hours;
        int timeTotal;
        if(!(splitTime.length == 3
                && (splitTime[0].matches("\\d\\d")
                || splitTime[0].matches("\\d"))
                && (splitTime[1].matches("\\d\\d")
                || splitTime[1].matches("\\d"))
                && (splitTime[2].matches("\\d\\d")
                || splitTime[2].matches("\\d")))){
            throw new InvalidTimeException("Enter a valid time");
        }else{
            hours = Integer.parseInt(splitTime[0]);
            int minutes = Integer.parseInt(splitTime[1]);
            int seconds = Integer.parseInt(splitTime[2]);
            if(hours > 23 || hours < 0){
                throw new InvalidTimeException("Hour must be below 24");
            }else if(minutes > 59 || minutes < 0){
                throw new InvalidTimeException("Minutes must be less than 60");
            }else if(seconds > 59 || seconds < 0){
                throw new InvalidTimeException("Seconds must be less than 60");
            }
            timeTotal = ((hours * 60 * 60) + (minutes * 60) + seconds);
        }
        return timeTotal;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time1;
        String time2;
        int second1;
        int second2;
        try{
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            time1 = sc.nextLine();
            second1 = time(time1);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            time2 = sc.nextLine();
            second2 = time(time2);
            int seconds = second2 - second1;
            System.out.println("Difference in seconds: " + seconds);
        }catch (Exception first){
            System.out.println(first.toString().substring(22));
        }
    }
}