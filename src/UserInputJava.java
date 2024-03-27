import java.util.Scanner; // if userInput in mentioned in the question then u have to use this import statement.



public class UserInputJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // an object from Scanner class is created.

        System.out.println("Hello Mr. User pls enter a number:  ");

        int num1=input.nextInt();  // we have taken input from the suer thru keyboard.

        System.out.println("enter the second number: ");

        int num2=input.nextInt();

        int sum=num1+num2;

        System.out.println(STR."The sum of 2 given numbers \{num1} and \{num2} is: \{sum}");

    }
}
