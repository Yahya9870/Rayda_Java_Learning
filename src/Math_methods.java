import java.util.Scanner;

public class Math_methods {
    public static void main(String[] args) {
        // Write a java program to ask user for the radius of the circle then prints its area.

        Scanner input= new Scanner(System.in);

//        System.out.println("Pls enter the radius of the circle:  ");
//
//        double radius= input.nextDouble();
//
//        double area= Math.PI*radius*radius;
//
//        System.out.println("The area of the circle is "+area);
//
//        System.out.println(Math.PI);

//        System.out.println("Enter a number: ");
//
//        int a=input.nextInt();
//
//        System.out.println("Enter one more number: ");
//
//        int b=input.nextInt();
//
//        System.out.println("The largest number entered by the user is: "+Math.max(a,b));

        System.out.println("Enter a number: ");

        int x=input.nextInt();

        System.out.println("Enter power of that number: ");

        int y = input.nextInt();

        System.out.println("The answer "+x+" raise to the power "+y+" is "+Math.pow(x,y));
    }
}
