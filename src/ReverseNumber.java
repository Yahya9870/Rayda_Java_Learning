import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that has to be reversed: ");
        int num=input.nextInt();
        int r;

        int rev=0;

        // num=   1     2   3     4

        while (num>0){

            r=num%10; // 1. 4 2. 3  3. 2  4. 1

            rev=rev*10+r; // 1. 4  2. 43 3. 432 4. 4321

            num=num/10;




        }


        System.out.println("The reverse of the number is: "+rev);

    }
}
