

public class Variables_And_DataTypes {
    public static void main(String[] args) {
//         Variable and Data Types in Java// 100 1+2+......+100
//         There are 2 kinds of data type in Java
//         1. Primitive 2. Non-Primitive
//         In Primitive we have 8 types 1. int  2. long 3. byte 4. short
//         5. boolean 6. char 7. float and 8. double
//         Non-Primitive we have Arrays, String, Map etc.
//         As of now we mostly focus on Primitive Data Types
        // int a=10; // integer literal
        // Variables naming convention has some rules for all of the data types in Java:
        // 1. It must not start with a number.



//          int 1huma=10;

        //int 1sushil=10;  //error

        //  int 1claudia;


        //      int 1sofiyan; // error
        //      int sofiyan1; // working


//             WRONG-->int 1cat = 10; (Error)  ||        CORRECT-->int cat=10;

//        int 1mark;
        // 2. It is case-sensitive. (Java is a case-sensitive language)


        // glenbhaiya883@gmail.com
        // GlEnBHaiYa883@GMAil.COm
        float f= 3.2F; // implicit type casting/conversion
        // sushil@gmail.com
        // SuSHiL@gMAil.COm  // email addresses are case insensitive.

        int sushil = 10;
        int Sushil = 11;
        int SUshil = 13;  // all three variables are different over here.


        int divyansh;
        int Divyansh;
        int rayda;
        int Rayda; // these two are not same however different identifiers.
        //wwwidmr1@gmail.com
        // WWwiDMr1@GMaiL.COm
        //  sofiyan@icloud.com
        //    SofIYaN@iCloud.COM
        // goldenshshash@gmail.com
        // GOldENHASH@Gmail.COm
        // dataType(int,char,float and so) indentifier.

        int Zahra, zahra, ZAHRA, ZaHRa;
        int a;
        int A;   // Java is Case Sensitive
        // NaTAsha@GMAIL.cOm email is case insensitive
//          int marK=10; int Mark=11; int MARK=13; int mark=15;
        // Email IDs are case in-sensitive in nature xyz@gmail.com Xyz@gmail.com


//        int lin=10;   int Lin =11;   int LIn=12;  int LIN=13; int liN=14;  All 4 are different variables over here.
//        System.out.println(lin);
//        System.out.println(Lin);
//        System.out.println(LIn);
//        System.out.println(LIN);
//        System.out.println(liN);

        //3. It should not be a keyword/reserve word.


//        int void; //error
        int Void; // it's fine now but not a good practice.


        int Static = 10;  // we should using keywords as variable names.

//        Wrong--> int void = 100; || int Void =100;

        //4. White Spaces are not allowed. (just normal spaces)
        //int hello; // Error
        int helloMyNameIsGlen;


        String myNameIsClaudia;


        // int hello my name is rayda; // error
        int Hello_My_Name_Is_Rayda;

        int abcdefghijklnnopqrst12345678__jhedcbje2bcej2hbche2cb; // no limit
        //Q1) which of the following variable name is/are valid in java:

        // a)123count    b) _abc123    c) Int   d) int
//        int _khaver123 = 10;
//        System.out.println(_khaver123);
//        int _abc123;


        // MyNameIsAziza CamelCaseTyping


//       Wrong--> int my  name is lin =50; // With white spaces
//       Correct --> int my_name_is_lin =50;   int MyNameIsLin =100; // Without white spaces error free.

        //5. Can contain underScores, numbers if above conditions are satisfied.
//         int mark_123;   it's a valid name
//         int _rahul123_12=10;
        // int zahra_786;

        //      int _sofiyan123;

//        int _lin123=10;
//        System.out.println(_lin123);


        // 1. Byte 1 byte (memory size) bits==BYTES X 8== 1X8=8bits. Generalized formula for the range -2^(NUMBER OF BITS-1)  to (2^(NUMBER OF BITS-1)-1 == -128 to 127
        byte b; // declaration
        b=127; // initialisation

        // byte b=10;
       // System.out.println(b);
//        // Database administrator


        // ur task is to store age of all people living in NYC
        //  example 9M people living in that city.
        long age; // 8 bytes // 9X8M= 72M memory size (it will take huge chunk of memory and )
        byte age1;  // 1 byte // 9X1=9M memory size (90% less memory as compared to int)
//        byte age = 0;  // optimal solution // software engineering is all about getting the best/optimal solution
//        System.out.println(age);
//        long age1=126;  // not optimal taking a lot of unnecessary spaces.
        // default value in zero

        //2. Short  2 bytes = 2X8 = 16 bits      range -2^15 to (2^15)-1
        // default value is zero                -2^(bits-1) to 2^(bits-1)-1

        //3. Integer or int  4 bytes = 4X8=32 bits    range -2^31 to (2^31)-1
        //    default value is zero

        // 4. float (decimal)  memory size is 4 bytes (its range is not defined).

       // float f1 = 3.86;

//        System.out.println(f);
        // all the decimal literals in java are double by-default.

        // int a =5; (hard coded)
        // ANY DECIMAL IN JAVA LIKE 7.8 IS OF DOUBLE DATA TYPE BY DEFAULT.

//
//        System.out.println(x);

        //     default value is 0.0f
        // 5. double memory size is 8 bytes (its range is not fined).
          double y = 3.16;
//        System.out.println(y);
        // default value is 0.0d or 0.0
        // 6. long  8 bytes = 8X8=64 BITS       range -2^63 to (2^63)-1
        long l = 1;
        // default value is zero
        // 7. char   2 bytes = 2X8=16 bits      range (2^16)-1  65535
        char name = '@';
        //System.out.println(name);

//        int something=5;
//        System.out.println(something);
//        System.out.println(name);
//        int asciiValue =name ;
//        System.out.println("The ASCII value of given alphabet b is: "+asciiValue);

        // 8. boolean it can be either true or false
//           boolean something1 = false;
//
//           System.out.println(something1);


        // size depends upon JVM (Java Virtual Machine)

        // Study deep about JDK (java development kit), JRE (Java RunTime Environment.) and JVM (Java Virtual Machine).

        // Also what is an IDE?

        // Is java a platform-dependent language or not? explain in detail.

        // Is java a purely object-oriented language or not? Explain.

        // Study resources: W3 schools, Lynda, Java T point

        // default value is false
//        int a=10;
//        System.out.println(a++);  // 10
//        System.out.println(a);    // 11

//        int b=10;
//        System.out.println(++b); // 11
//        System.out.println(b++); // 11
//        System.out.println(++b); // 12           (4/5) marks 80%

        // if u put ++ or -- after the variable then it is called post incremental operator.
        // ++ or -- we put before the variable then it is called pre incremental operator and it updates the variable right-away.

        // System.out.println("Program is running");
    }
}


