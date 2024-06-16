import java.util.Random;
import java.util.Scanner;

public class Random_Number_Generation {
    public static void main(String[] args) {
        Random rd = new Random();



        // write a java program that generates a random number with range 1 to 6

        //   int randomNumber= rd.nextInt(5)+1;  1 to 5
        //   System.out.println(randomNumber);


        // Generate a random integer within the specific range [a, b]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range starting point:    ");
        int a = sc.nextInt();
        System.out.println("Enter the range ending point:    ");
        int b = sc.nextInt();


        int randomNumber = rd.nextInt(b - a + 1) + a;  // generalised formula for creating a random number between a and b

        System.out.println("The random number generated between " + a + " and " + b + " inclusive is " + randomNumber);
    }

}
