import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question>Quizzes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    int levelOfDifficulty;
    int i, modifyNum, removeNum, j, l;
    String attempt;
    String question, answer;

    public void add_question(){
        System.out.println("What is the question Text? ");
        question = sc.nextLine();
        System.out.println("What is the answer? ");
        answer = sc.nextLine();
        System.out.println("How Difficult (1-3)? ");
        levelOfDifficulty = sc.nextInt();
        sc.nextLine();
        Question quiz = new Question(question, answer, levelOfDifficulty);
        Quizzes.add(quiz);
    }

    public void remove_question(){
        System.out.println("Choose the question to remove? ");
        for(Question Quiz : Quizzes){
            System.out.println((j) + "." + Quiz.getQuestion());
            j++;
        }
        j = 0;
        System.out.print("");
        removeNum = sc.nextInt();
        Quizzes.remove(removeNum);
    }

    public void modify_question(){
        System.out.println("Choose the question to modify? ");
        for(Question quiz: Quizzes){
            System.out.println(i + "." + quiz.getQuestion());
            i++;
        }
        i = 0;
        System.out.print("");
        modifyNum = sc.nextInt();
        sc.nextLine();
        System.out.println("What is the question Text? ");
        question = sc.nextLine();
        System.out.println("What is the answer? ");
        answer = sc.nextLine();
        System.out.println("How Difficult (1-3)? ");
        levelOfDifficulty = sc.nextInt();
        sc.nextLine();
        Quizzes.set(modifyNum, new Question(question, answer, levelOfDifficulty));
    }

    public void give_quiz(){
        for(Question quiz : Quizzes){
            System.out.println(quiz.getQuestion());
            System.out.print("");
            attempt = sc.next();
            sc.nextLine();
            if(attempt.equalsIgnoreCase(quiz.getAnswer())){
                System.out.println("Correct");
                l++;
            }else{
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got " + l + " out of " + Quizzes.size());
    }
}
