
import java.util.Scanner;  // step 1

public class UserInput {
    public static void main(String[] args) {
        // odd even
        // if age>18 then right vote
        // we took user defined value.

      //  int userDefine=100;

        //Step 2: creating an object from Scanner class;
        Scanner sc=new Scanner(System.in);

        System.out.println("Hello Mr.User Pls enter a number: ");
        int userInput=sc.nextInt(); // we have taken input from the user through keyboard.

        System.out.println("The given number by the user is: "+userInput);
    }
}
