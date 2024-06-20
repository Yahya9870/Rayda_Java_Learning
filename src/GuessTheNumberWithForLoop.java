import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithForLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        int secretNumber = rand.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");
        int attempts=0;


        for (; ;) {  // infinite loop runnning

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Try a higher number");
            } else if (guess > secretNumber) {
                System.out.println("Try a lower");
            } else {

                System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in "+attempts+" attempts.");
                break;
            }

        }
    }
}
