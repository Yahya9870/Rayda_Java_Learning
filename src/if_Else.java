import java.util.Scanner;
public class if_Else {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pls enter the age: ");
        int age= input.nextInt(); // taken the input from the user thru keyboard.

//        if(age>127 || age<0){
//
//            System.out.println("Invalid input");
//        } else if (age>=18) {
//
//            System.out.println("Eligible to vote");
//
//        } else {
//            System.out.println("Not eligible");
//        }

        // Write a java program to identify the age group of a person.

        if(age>127 || age<0){

            System.out.println("Error 404 not found!!!!");
        } else if (age<18) {

            System.out.println("Minor");

        } else if (age<41) {
            System.out.println("Young");
        } else if (age<61) {
            System.out.println("Middle Aged");
        } else if (age<76) {

            System.out.println("Old");

        }

        else{

            System.out.println("Extremely Old");
        }


    }
}
