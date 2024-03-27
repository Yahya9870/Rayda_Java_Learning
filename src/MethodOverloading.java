public class MethodOverloading {
    public static void main(String[] args) {
        // Method Overloading.
        // It takes place within the same class.
        // Name of the methods are same however different parameters will be passed.
        // Example

        // Develop a Java program that calculates Area of different figures.
        double radius=6.0;
        int side=4;

        double length=5.0,width=7.0;

        System.out.println(area(radius));
        System.out.println(area(side));
        System.out.println(area(length,width));

      int a=  Math.addExact(20,30);
        System.out.println(a);



    }

    public static double area(double radius){

        double result=Math.PI*radius*radius;

        return result;



    }

    public static double area(int side){
        float result = side*side;

        return result;

    }


    public static double area(double length,double width){

        return width*length;


    }


}
