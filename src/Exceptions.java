import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // We have to write a java program that takes two integers as input from the user and perform divide operation.
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number: ");
        int a= sc.nextInt();
        System.out.println("Second Number: ");
        int b= sc.nextInt();

        if(division(a,b)==-1){

            System.out.println("Invalid Inputs Provided");
        }

        else {
            System.out.println(STR."The division of given integers is: \{division(a,b)}");
        }


    }

    public static int division(int x, int y){
        if(y==0){
            System.out.println("Division by zero is un-defined");
            return -1;
        }

        return x/y;
    }
}
