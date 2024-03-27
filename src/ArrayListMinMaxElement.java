import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMinMaxElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter integers into the ArrayList
        System.out.println("Enter integers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Find and display the maximum and minimum elements in the list
        if (!numbers.isEmpty()) {
            int max = numbers.get(0);
            int min = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                int current = numbers.get(i);
                if (current > max) {
                    max = current;
                }
                if (current < min) {
                    min = current;
                }
            }
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        } else {
            System.out.println("No elements entered.");
        }
    }
}
