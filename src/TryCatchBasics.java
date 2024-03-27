import java.util.*;
public class TryCatchBasics {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.err.println("Error: You must enter a valid integer.");
        }
        finally {
            System.out.println("Finally blocks executes always after try");

        }
    }
}
