import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not.

        Scanner input = new Scanner(System.in);
        System.out.println("Hello Mr.User\npls enter a number that you want to\nPrime or Not Prime: ");
        long num=input.nextLong();
        int count=0;

        // num=18
        // loop will be from 2 to num-1 i.e. 2 to 17 (2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)

        for (int i = 2; i <num ; i++) {

            if(num%i==0){    //1. 18%2==0 ; count=1
                             //2. 18%3==0 ; count=2
                             //3. 18%4!=0 ; count=2
                             //6. 18%6==0 ; count=3
                             //9. 18%9==0 ; count=4

                count++;
                break;

            }


        }

        if(count==0){

            System.out.println("Prime Number");
        }

        else {

            System.out.println("Not Prime");
        }
    }
}
