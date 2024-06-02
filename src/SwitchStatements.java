import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        //Syntax
//        switch (integer input)
//        case 1:
//            coding logic;
//            break;
//        case 2:
//            coding logic;
//            break;
//
//        default:
//        System.out.println("Default");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int num= input.nextInt();
        // Normal Switch cases:
        switch (num) {
            case 1:
                System.out.println("User Entered 1");
                break;
            case 2:
                System.out.println("User Entered 2");
                break;
            case 3:
                System.out.println("3 is entered by the user");
                break;

            default:
                System.out.println("User has entered: " + num);

        }

        // Enhanced Switch Cases:

//        switch (num){
//
//            case 1 -> System.out.println("User enterd 1");
//            case 2 -> System.out.println("User enterd 2");
//            case 3 -> System.out.println("User enterd 3");
//            case 4 -> System.out.println("User enterd 4");
//            default -> System.out.println("User has entered: " + num);
//        }
        
    }
}
