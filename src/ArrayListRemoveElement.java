import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemoveElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to populate the ArrayList with integers
        System.out.println("Enter integers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Display the original list
        System.out.println("Original list: " + numbers);

        // Prompt the user to enter a number to remove
        System.out.print("Enter a number to remove: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next(); // discard non-integer input
        }
        int numToRemove = scanner.nextInt();

        // Remove the number if it exists in the list
        boolean removed = numbers.remove(Integer.valueOf(numToRemove));

        // Display the updated list
        if (removed) {
            System.out.println("Number " + numToRemove + " removed.");
            System.out.println("Updated list: " + numbers);
        } else {
            System.out.println("Number " + numToRemove + " not found in the list.");
        }
    }
}
