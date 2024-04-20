import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        // WAP that returns number of digits in a number entered by the user.
        // for example, 1234 will return 4
        // 234567 --> 6
        // 1234567--> 7

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");

        // Method 1:


//
//        int num= input.nextInt();
//        int count=0;
//        // num=1234
//        while (num>0){
//
//            num=num/10; // 1.num=123, 2. num=12 3. 1  4. 0
//            count++; // 1.count=1 2. count=2  3. 3  4. 4
//            // count=count+1;
//
//        }
//
//        System.out.println("The count of number given by the user is: "+count);

        // Method 2:

//        String num=input.nextLine();
//
//        int count=num.length();
//
//        System.out.println("The number digits in the given by you is "+count);


    }
}
