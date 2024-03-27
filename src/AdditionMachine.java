import java.util.Scanner;
import java.util.InputMismatchException;

public class AdditionMachine {
    public static void main(String[] args) {
        boolean ranOnce = false;
        double result = 0.0;
        Scanner scan = new Scanner(System.in);
        while (true) {

            try {
                System.out.print("Enter a number: ");
                result += scan.nextDouble();
                ranOnce = true;
            } catch (InputMismatchException ime) {
                System.err.println("Was expecting a number!");
                System.err.println(ime);
                if (ranOnce) {
                    System.out.println("Result: " + result);
                }
                break;
            }
        }
    }
}
