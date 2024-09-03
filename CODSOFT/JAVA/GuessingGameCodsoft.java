import java.util.Random;
import java.util.Scanner;

public class GuessingGameCodsoft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        boolean wrong = true;

        while (wrong) {
            int n = r.nextInt(100) + 1;
            int a = 0;
            int m = 5;
            boolean guessed = false;

            System.out.println("Welcome to the number guessing game!");
            System.out.println("Guess the number between 1 and 100.");
            System.out.println("You have " + m + " attempts to guess the number.");

            while (!guessed && a < m) {
                System.out.print("Enter your guessed number: ");
                int guess = scanner.nextInt();
                a++;

                if (guess < n) {
                    System.out.println("Your guessed number is very far from my guess.");
                } else if (guess > n) {
                    System.out.println("Your guessed number is very near from my guess.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + a + " attempts.");
                    score++;
                    guessed = true;
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you didn't guess the number. The number was " + n + ".");
            }
            System.out.println("Your current score is " + score + ".\n");
        }

        scanner.close();
    }
}