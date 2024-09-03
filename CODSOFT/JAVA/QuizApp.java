import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "What is the color of the sky?"
        };

        String[][] options = {
            {"Paris", "Berlin", "Madrid"},
            {"3", "4", "5"},
            {"Blue", "Green", "Red"}
        };

        int[] correctAnswers = {0, 1, 0}; 

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

      
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }, 15000);

            System.out.print("Your choice (1-" + options[i].length + "): ");
            int userChoice = sc.nextInt() - 1; 

            if (userChoice == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }

            timer.cancel();
        }

        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);
    }
}
