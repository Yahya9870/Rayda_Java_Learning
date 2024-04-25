import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");

        System.out.println("What operation you want to perform:");
        System.out.println("Please select the desired one");


        System.out.println("+, -, *, /");




        char ch=input.next().charAt(0); // this is how we take character input.

        System.out.println("Enter the first number: ");
        double num1= input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2= input.nextDouble();


        double result;
        if(ch=='+'){
            result=num1+num2;

            System.out.println("The result is: "+ result);

        } else if (ch=='-') {

            result=num1-num2;
            System.out.println("The result is: "+ result);


        } else if (ch=='*') {

            result=num1*num2;
            System.out.println("The result is: "+ result);

        } else if (ch=='/') {

            if(num2==0){

                System.out.println("Cannot divided by 0 math Error!");
            }

            else {
                result=num1/num2;
                System.out.println("The result is: "+ result);

            }

        }

        else {

            System.out.println("Invalid Operator");
        }




    }
}
