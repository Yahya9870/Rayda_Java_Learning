import java.util.Scanner;
import java.util.Arrays;


public class PasswordVerification {
    public static void main(String[] args) {

        // WAP that asks user to enter a password if user enters password wrong 3 times then the account will get blocked.
        // Define the correct password
        int correctPassword = 1234;

        int count=0;

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the password
        int inputPassword;
        do {
            System.out.print("Enter the password: ");
            inputPassword = scanner.nextInt();

            // Check if the entered password matches the correct password
            if (inputPassword==(correctPassword)) {
                System.out.println("Access granted! Welcome.");
                break; // Exit the loop if the password is correct
            } else {
                System.out.println("Incorrect password. Please try again.");
                count++;
                if(count==3){
                    System.out.println("Your account has been temporally blocked");
                    break;
                }
            }
        } while (true); // Repeat until the correct password is entered

        // Close the Scanner
        scanner.close(); // not necessary but a good programming practice.
    }
}
