import java.util.Scanner;

public class Methods_Java {
    public static void main(String[] args) {
        // calling of method sushil
        //sushil();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:   ");
        int a= input.nextInt();
        System.out.println("Enter the second number:   ");
        int b= input.nextInt();
        sum(a,b); // here a and b are arguments based on the parameters of method sum.
    }
 // declaration and definition of the method
   // non-returning and non-parametrized method.
    public static void sushil(){

        System.out.println("I am sushil and this is my method");

    }

//    non-returning and parametrized method
    public static void sum(int a, int b){   // int a and int b are parameters of method sum();
      int sum=a+b;
        System.out.println("The sum of given 2 integers is: "+sum);
    }




}

// different kind of methods
//1. non-returning and non parametrized.
//2. non-returning and parametrized.
//3. returning and parametrized.
//4. non-returning and parametrized.

// What is a method in Java?
// In other languages it is termed as functions however in java they are known as methods.
// These are code snippets consisting of specific tasks.
// void not returning any value
