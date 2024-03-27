
import java.util.Scanner;

public class UserInputInJava {

    public static void main(String[] args) {
        //For user input some basic steps are that one has to follow in every problem are:
        //1. import the library name java.util.Scanner.
        //2. Create a object using Scanner class.
        //3. With the help of that object take the desired input.
        Scanner input = new Scanner(System.in); // This line must for user input. --> it is creating an object from the class Scanner and Scanner is a predefined or inbuilt class of Java.
        System.out.println("Hello Mr. User pls enter the age: ");
        int age = input.nextInt(); // This line has taken the input from the user through keyboard.
        if(age>=18){
            System.out.println("Eligible to vote");
        }

        else{
            System.out.println("Not eligible to vote");
        }


    }
}
