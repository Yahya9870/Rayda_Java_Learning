public class WrapperClass {
    public static void main(String[] args) {
        int num=10; // primitive datatype  // it is get stored stacks memory and no constructor is called.

        Integer num1=8;   //This num1 is an object from the Wrapper class Integer it will get stored in heap memory
        System.out.println(num1);
        Integer age = new Integer("40");
        Double num2 = new Double("8.2");
        Boolean isDone = new Boolean("true");

        System.out.println(age*2);
        System.out.println(num2);
        System.out.println(isDone);

        String str="12";

        int num4=Integer.parseInt(str);

        System.out.println(num4*3);

        // Autoboxing
        int a=7; //primitive
        // Covert this into wrapper class
        Integer b=a;  // wrapping

       // Integer c=new Integer(a); // boxing

        int c=b;  // auto-Unboxing

        System.out.println(c);

        Double dbl = new Double(8.2);
        int val = dbl.intValue(); //stores 8 in val

        System.out.println(val);

        int x=Integer.MAX_VALUE;
        int y=Integer.MIN_VALUE;

        System.out.println(x);

        int w= (int) Math.pow(2,31);
        System.out.println(w);
        System.out.println(y);




    }
}
