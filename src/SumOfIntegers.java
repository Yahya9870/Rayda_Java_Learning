import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=input.nextInt();
        System.out.println("Enter the second number: ");
        int b= input.nextInt();
        int result=sum(a,b);

        System.out.println("The sum of 2 integers is: "+result);
    }

    public static int sum(int x, int y){


        return (x+y);
    }
}
