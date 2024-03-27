import java.util.Scanner;

public class CharacterIndexPrinter {

    public static void printCharactersWithIndex(String str) {
        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Print the character and its index
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to print characters with their indices
        printCharactersWithIndex(inputString);

        scanner.close();
    }
}
