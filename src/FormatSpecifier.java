import java.util.Random;

public class FormatSpecifier {

    public static void main(String[] args) {
        
        
        int a=10;
        int b=20;
        double d=78.32;
        char ch='S';
        String str="Sushil";

        System.out.println("The value of a is "+a+" value of b "+b+" d is "+d+" ch is "+ch+" str is "+str);
        System.out.format("The value of a is %d, b is %d d is %f ch is %c and str is %s\n",a,b,d,ch,str);

        // %d for integers, byte, short and long
        // %f for float and double 
        // %c is for character
        // %s is for Strings

        // these are knows format specifiers.

         
        
        
        
        
        
        
        // Random random = new Random();

        // int num=random.nextInt(6)+1; // it will generate a random number between 1 to 6

        // System.out.println(num);
    }
}
