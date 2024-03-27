public class Rectangle1 {
    // Data Members/Fields
    int width;
    int length;

    // Methods

    public void perimeter(int width, int length){

        int perimeter=2*(width+length);

        System.out.println("The perimeter of the given rectangle is: "+perimeter);


    }

    public void area(int width,int length){


        int area=(width*length);

        System.out.println("The area of the given rectangle is: "+area);
    }


    public void showName(){


        System.out.println("My name is Sufyan");
    }




}
