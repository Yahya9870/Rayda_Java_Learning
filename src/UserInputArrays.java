import java.util.Arrays;
import java.util.Scanner;

public class UserInputArrays {
    public static void main(String[] args) {
        // User Input in Arrays

        Scanner input=new Scanner(System.in);

        System.out.println("Mr.User pls enter the size of the array");
        int size=input.nextInt(); // we have taken size of the array from the user.
        int [] arr=new int[size]; // we have got an array of size based on user  input.
        // Memory allocation of the array at runTime Environment based on user input.

        for (int i = 0; i < size ; i++) {


                System.out.println("Pls enter element "+(i+1)+" of the array");
                arr[i]= input.nextInt();



        }

        System.out.println("The user entered array is given below: ");

        for (int i = 0; i <size ; i++) {

            System.out.print(arr[i]+" ");

        }
    }
}
