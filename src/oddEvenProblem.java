import java.util.Scanner;

public class oddEvenProblem {
    public static void main(String[] args) {
        // User Input
        // Step 1: import java.util.Scanner;
        // Step 2; create an object from Scanner class;
        // step 3; take input with the help of that object;
        // creation of an object from the Scanner class.
        Scanner input =new Scanner(System.in);

        System.out.println("Hello Mr. User pls enter a number: ");

        int num=input.nextInt(); // we have taken input from the user through the keyboard.

       if(num%2==1){
           System.out.println("Odd Number");
       }
       else{
           System.out.println("Even Number");
       }
    }
}
