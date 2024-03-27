import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        // Taking input from the user to populate our list.

        System.out.println("Enter integers (enter any non-integer value to stop)");

        while (sc.hasNextInt()){

            int num= sc.nextInt();

            numberList.add(num);
        }

        // Display the originsal ArrayList
        System.out.println("This is our list");
        System.out.println(numberList);
    }
}
