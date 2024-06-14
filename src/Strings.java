
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String
        // Sequence of characters
        // It's a class in Java

        //String name=new String("Rayda");

//        String myName; // declaration of string just int a;
//        myName="Sushil"; // initialisation of string
//
//        System.out.println("Sushil");
//
//        String str = new String("My Name is Sushil");
//
//        System.out.println(str);

        // We can do both in one line also like String myName= "Sushil";

        // But due to its extensive in Java, Java has provided a special access to string in which we can use it like a primitive datatype

        // String name="Rayda";  // it occupies space in string pool.



        //  System.out.println(name);

        // Strings are immutable mins cannot be changed.

        // Different type of print statements in Java

        //System.out.println("Normal print ln that changes the line after printing the statement");
        // System.out.print("It does not change the line after printing the statement\n");

        int a = 10;
        float f = 2.5f;
        char ch = 'R';

        // System.out.println(); // this also changes the line
        // System.out.printf("The value of a is %d, b is %f, c is %c and str is %s",a,f,ch,str);
        // %d is for integers, %f for float, %c for character and %s for strings, and collectively they are know as format specifiers.

        // System.out.format("The value of a is %d, b is %f, c is %c and str is %s",a,f,ch,str);

        // How to take user input as a String.

          Scanner input = new Scanner(System.in);

//        System.out.println("Pls enter the String you want: ");
//
//        String name=input.nextLine(); // taken input from the user.
//
//        System.out.println("The name entered by the user is: "+name);

        // String Methods and Manipulations: (Very, Very Important).
        String name = "Rayda";
        //1. Length
//        int strLength=name.length();
//        System.out.println(strLength);

        //2. toLowerCase() --> it converts all of the characters in a string to lower case.

//        String lowerCase=name.toLowerCase();
//
//        System.out.println(lowerCase);

        //3. toUpperCase()
        //String upperCase=name.toUpperCase();

        //System.out.println(upperCase);

        //4. Trim() --> returns a new string with removal of all leading and trailing spaces.

        //System.out.println(name.trim());

        //5. substring(int start) --> it returns a new string from including given integers till the end.

        // System.out.println(name.substring(2));


        //6. substring(int start, int end) --> it return a new string with start included and end exluded.

        //System.out.println(name.substring(0,5));


        //7. replace ('ch','ch')

        //System.out.println(name.replace("d","fa"));

        //8. startsWith("Ray") --> it return a boolean output mins true or false.

        //System.out.println(name.startsWith("ray"));

        //9. endsWith("a")
        //System.out.println(name.endsWith("yda"));

        


        //10. charAt(index) --> it return that specific character at that particular index provided top the method.

        // System.out.println(name.charAt(3));

        // 11. indexOf(String)--> it return occurence of that given string.

        //  System.out.println(name.indexOf("a"));

        // 12. indexOf --> as same as above but searching starts from provided index.

        //System.out.println(name.indexOf("a",2));

        // 13. lastIndexOf

        //  System.out.println(name.lastIndexOf("a"));

        // 14. lastIndexof(string,int index) --> before a particular index it return index of given string

        // System.out.println(name.lastIndexOf("a",5));

        //15. equals --> boolean output

        //System.out.println(name.equals("Rayda"));

        // 16. equalsIgnoreCase --> as same as equals but case insensitive.

        //System.out.println(name.equalsIgnoreCase("rAYdaA"));

        // 17. concat()

        //System.out.println(name.concat("Yahya"));


        // Escape Sequence Characters

        //.   \n for a new line
        //.   \t for adding a space equivalent to a tab.
        //.   \\ this for adding backslash
        //    \' this for adding single quote
        //    \b backspace
        //   \\"

        // System.out.println("Hello\tI am a student\nnow we r in a new line \\ \"i am using double quotes inside print statement\"");


    }
}
