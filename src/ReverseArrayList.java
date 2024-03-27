import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter integers into the ArrayList
        System.out.println("Enter integers (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Display the original list
        System.out.println("Original list: " + numbers);

        // Reverse the order of elements in the list using swapping
        int i = 0;
        int j = numbers.size() - 1;

        while (i < j) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);
            i++;
            j--;
        }

        // Display the reversed list
        System.out.println("Reversed list: " + numbers);
    }
}
