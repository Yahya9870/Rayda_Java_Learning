import java.util.Scanner;

public class Java_Method_Areas {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double base=sc.nextDouble();
        System.out.println("Enter height of the triangle: ");
        double height=sc.nextDouble();
        double areaTriangle=areaTriangle(base,height);

        System.out.println("The area of the triangle is: "+areaTriangle);
    }

    // Write a method in order to calculate area of triangle:

    public static double areaTriangle(double base, double height){

        double ans= (0.5)*(base*height);

        return ans;
    }
}
