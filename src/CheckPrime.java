import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter the number that you have to check whether it is prime or not.");

        int num = input.nextInt();

        boolean result = checkPrime(num);

        System.out.println("The given number is Prime: " + result);
    }

    public static boolean checkPrime(int num) {

        // user enter 20
        // for loop will run from 2 to 19
        int count = 0;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                count++;
                break;
            }

        }

        if (count == 1) {

            return false;
        } else {

            return true;
        }


    }
}
