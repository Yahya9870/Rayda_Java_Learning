import java.util.Scanner; // if userInput in mentioned in the question then u have to use this import statement.




public class UserInputJava {
    public static void main(String[] args) {
        // Write a java program to add two numbers given by user.
        Scanner input = new Scanner(System.in); // an object from Scanner class is created.

        System.out.println("Hello Mr. User pls enter first number:  ");

        int num1=input.nextInt();  // we have taken input from the user through the keyboard.

        System.out.println("Enter the second number: ");

        int num2=input.nextInt(); // we have taken second input also

        int sum=num1+num2; // we will gonna add num1 and num2 based on user input.

        //System.out.printf("The sum of integers %d and %d is %d",num1,num2,sum);
        System.out.println("The sum of integers "+num1+ " and "+ num2 +" is "+sum);

        int a=10,b=20,c=30;
        double d=3.2,e=6.72;
        char ch='F';
        String str="Sushil";
       // System.out.format() and System.out.printf() both are exactly same just the name is different.
        System.out.format("The values of a,b,c,d,e,ch and str are %d, %d, %d, %.2f, %.2f, %c and %s respectively.",a,b,c,d,e,ch,str);

        // %d for integers
        // %c for characters
        // %s for strings
        // %f for float and double values

    }
}
