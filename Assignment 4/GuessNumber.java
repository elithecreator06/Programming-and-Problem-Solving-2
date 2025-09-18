import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    Random myRand = new Random();

    public void play_game(){
        Scanner sc = new Scanner(System.in);

        int choice;
        int result;
        int num = myRand.nextInt(100);

        System.out.println("""
                Choose your language
                1. English
                2. Español
                3. Français
                4. 简体中文""");
        choice = sc.nextInt();

        if(choice == 1){
            Language myLang = new English();
            System.out.println(myLang.make_guess());
            result = sc.nextInt();
            while (true){
                if(result == num){
                    System.out.println(myLang.correct());
                    break;
                }else if(result < num){
                    System.out.println(myLang.too_low());
                }else if(result > num){
                    System.out.println(myLang.too_high());
                }

                System.out.println(myLang.make_guess());
                result = sc.nextInt();
            }
        }else if(choice == 2){
            Language myLang = new Spanish();
            System.out.println(myLang.make_guess());
            result = sc.nextInt();
            while (true){
                if(result == num){
                    System.out.println(myLang.correct());
                    break;
                }else if(result < num){
                    System.out.println(myLang.too_low());
                }else if(result > num){
                    System.out.println(myLang.too_high());
                }

                System.out.println(myLang.make_guess());
                result = sc.nextInt();
            }
        }else if(choice == 3){
            Language myLang = new French();
            System.out.println(myLang.make_guess());
            result = sc.nextInt();
            while (true){
                if(result == num){
                    System.out.println(myLang.correct());
                    break;
                }else if(result < num){
                    System.out.println(myLang.too_low());
                }else if(result > num){
                    System.out.println(myLang.too_high());
                }

                System.out.println(myLang.make_guess());
                result = sc.nextInt();
            }
        }else if(choice == 4){
            Language myLang = new SimplifiedChinese();
            System.out.println(myLang.make_guess());
            result = sc.nextInt();
            while (true){
                if(result == num){
                    System.out.println(myLang.correct());
                    break;
                }else if(result < num){
                    System.out.println(myLang.too_low());
                }else if(result > num){
                    System.out.println(myLang.too_high());
                }

                System.out.println(myLang.make_guess());
                result = sc.nextInt();
            }
        }
    }
}
