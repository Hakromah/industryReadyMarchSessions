import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randoNum = rand.nextInt(100) + 1; // It will generate a random number between 1 and 100 inclusive.

        int attempts = 0;
        int maxAttempts = 5;
        int guess = 0;

        while (attempts < maxAttempts) {
            System.out.println("Enter your Guess between 1 and 100:");
            guess = scan.nextInt();
            attempts++;

            if (guess == randoNum) {
                System.out.println("Congrats! You guessed the correct number in " + attempts + " attempts");
                System.out.println("The number was: " + randoNum + " == " + "your guess: " + guess);
                break;
            } else if (attempts < maxAttempts) {
                System.out.println("Wrong Guess. Please Try Again");
                if (guess < randoNum) {
                    System.out.println("Hint: The number is higher than " + guess);
                } else {
                    System.out.println("Hint: The number is lower than " + guess);
                }
            }else {
                System.out.println("Wrong Guess Game Over!");
                break;
            }
        }
        if (attempts == maxAttempts && guess != randoNum) {
            System.out.println("You couldn't guess the number within " + maxAttempts + " attempts.");
            System.out.println("The correct number was: " + randoNum);
        }
        scan.close();
    }

}
