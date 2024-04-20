import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // 1234 --> 1+2+3+4=10
        // 2356 --> 2+3+5+6=16

        // if there is number n

        // if you do n/10, then it will eliminate the last digit of that number.
        // for example if n is 1234 we do 1234/10=123
        // 56789/10=5678
        // 987654/10=98765

        // if you do n%10, then it will give you last digit of that number:
        // for example if you do 1234%10=4
        // 43789%10=9
        // 98765432%10=2

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num= input.nextInt();

        int sum=0;
        int r;
        // num=     1      2      3        4
        while(num>0){

            r=num%10;

            sum=sum+r; //4+3+2+1=10

            num=num/10;


        }

        System.out.println("The sum of digits of given number by user is: "+sum);

    }
}
