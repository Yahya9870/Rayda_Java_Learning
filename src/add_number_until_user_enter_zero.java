import java.util.Scanner;

public class add_number_until_user_enter_zero {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number;
        int sum=0;
        while(true){
            System.out.println("Enter a number (0) for break: ");
            number=input.nextInt();
            if(number==0){

                System.out.println("Zero Encountered");
                System.out.println("Exiting the loop......");
                break;
            }
            sum+=number;


            System.out.println(sum+" sum so far");


        }

        System.out.println("Final sum is:"+sum);







    }
}