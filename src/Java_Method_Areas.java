import java.util.Scanner;

/**
 * This class demonstrates how to calculate the area of a triangle using methods in Java.
 */
public class Java_Method_Areas {

    /**
     * The main method is the entry point of the program.
     * It prompts the user for the base and height of the triangle,
     * calculates the area, and displays the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        // Call the areaTriangle method to calculate the area of the triangle
        double areaTriangle = areaTriangle(base, height);

        // Display the calculated area of the triangle
        System.out.println("The area of the triangle is: " + areaTriangle);
    }

    /**
     * This method calculates the area of a triangle given its base and height.
     *
     * @param base   The base of the triangle.
     * @param height The height of the triangle.
     * @return The area of the triangle.
     */
    public static double areaTriangle(double base, double height) {
        // Calculate the area using the formula: (0.5) * (base * height)
        double ans = 0.5 * (base * height);

        // Return the calculated area
        return ans;
    }
}

