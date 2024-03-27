public class BreakStatement {

    public static void main(String[] args) {
        // Break Statement

        // Write a Java Program that print integers 1 to 100 multiples of 3 but if 51 is there in the given condition then dont print further.

        for (int i = 0; i <=100 ; i+=3) {
            if(i==54){
                break; // it terminates the loop right away irrespective whether loop has iterated all conditions or not.
            }
            System.out.println(i);

        }
    }
}
