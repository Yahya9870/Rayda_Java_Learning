//public class ControlFlow {
//    public static void main(String[] args) {
//        // Control Flow --> It refers to the order in which your program is going to execute statements wise.
//
//        // Conditional Statements. (if else statements). Very, very, very important.
//
//        // Syntax
//        // which operators give boolean outputs?
//        // Logical and Relational/comparison > < >= <= == and || && ! etc.
//        // like boolean something = true;
//        // if(a condition with boolean return type mins either true or false){
//        //
//        // // coding logics like anything eg System.out.println("Hey World!");
//        //
//        // }
//        // else{
//        //
//        // coding logics like a print statement and so on.
//        //
//        // }
//
//        // if the condition written under if paranthesis is true then if block will get executed and else block will not.
//        // if the condition of if is false then only else block will get executed.
//
//        // Can an if statement exist alone???
//        // The answer is yes it can.
//        // Can an else statement exist alone??
//        // so it is not possible.
//
//        // Control Flow --> 1. Condition of if will get checked then if it is true then if block will get executed and compiler will not go to else block.
//        // Control Flow Step 2: if condition is false then compiler won't go inside if block it will straight away execute the else block.
//
//        // Real Life Example of if-else
//        // Write a Java Program to check whether a person is eligible or not for voting. 18 or above can vote.
//        {
////            int age = -6; // user defined value or hardcoded/fixed a value that is not going to change in the program.
////            if(age>130 || age<0){
////
////                System.out.println("Invalid Age!!!");
////            }
////
////            else {
////
////            if (age >= 18) {
////                System.out.println("You are eligible to vote.");
////            } else {
////
////                System.out.println("You are not eligible to vote.");
////            }
//
//
//        } }
//
//        {
//            // Develop a java program with a given age and income and return whether or not they are eligible for the pension.
//            // For eligibility of pension age must greater than 60 and income should be less than 100,000 dollars, height should be less than 6 feet.
//            // Nested if else statements
//
//            int age = 65;
//            int income = 50000;
//            int height = 7;
//
//            if (age >= 60) {
//
//                if (income < 100000) {
//
//                    if (height >= 6) {
//
//                        System.out.println("You will be getting pension scheme!!! Congrats");
//                    }
//                }
//            } else {
//
//                System.out.println("Sorry u won't be getting any money!!");
//            }
//
//
//        }
//
//        // If else if ladder. (in Python it is called if elif ladder)
//        // Control Flow of if else if ladder it will check conditions starting from first if followed by upcoming else if statements the moment we got any true condition that block will get executed and our if else if ladder terminates it will not check the conditions further.
//        // if all of the conditions of if and else if are false then finally in the end else block will get executed.
//        // Write a java program to check the person's age group.
//
//        int age = 50;
//
//        if (age < 0 || age>130) {
//
//            System.out.println("Invalid age!!!!");
//        } else if (age < 18) {
//
//            System.out.println("You are a minor");
//
//        } else if (age <= 40) {
//
//            System.out.println("You are a young individual");
//
//        } else if (age < 61) {
//
//            System.out.println("You are a middle aged man or woman");
//
//        } else if (age <= 100) {
//
//            System.out.println("You are between oldness and extreme oldness ");
//        } else { // by default
//
//            System.out.println("You are 100+");
//
//        }
//
//        /* Switch Statements */
//
//        // These are almost similar to our if else-if ladder syntax is different.
//
//        // Write a Java Program that return name of day in a week with the help of its corresponding number.
//        // for example for 1 we will be getting Monday.
//
//        int dayOfWeek = 1;
//
////        switch (dayOfWeek){
////
////            case 1:
////                System.out.println("It's Monday");
////                break;
////
////            case 2:
////                System.out.println("It's Tuesday");
////                break;
////
////            case 3:
////                System.out.println("Wednesday");
////                break;
////
////            case 4:
////                System.out.println("Thursday");
////                break;
////
////            case 5:
////                System.out.println("Friday");
////                break;
////
////            case 6:
////                System.out.println("Saturday");
////                break;
////
////            case 7:
////                System.out.println("Sunday");
////
////                break;
////
////            default:
////                System.out.println("Invalid day");
////
////
////
////
////        }
//
//
//        // Enhanced Switch Statements
//
//        // System.out.println("Enhanced Switch Statements: ");
////        switch (dayOfWeek) {
////            case 1 -> System.out.println("It's Monday");
////            case 2 -> System.out.println("It's Tuesday");
////            case 3 -> System.out.println("Wednesday");
////            case 4 -> System.out.println("Thursday");
////            case 5 -> System.out.println("Friday");
////            case 6 -> System.out.println("Saturday");
////            case 7 -> System.out.println("Sunday");
////            default -> System.out.println("Invalid day");
//        // if else if ladder
//        // we have marks of a student of 100 and we have to return his grades.
//        // like A for 90 or above, B for 80+ C for 70+ D for 60+ E for 50+ for F for fail
//
//        int marks = 88;
//
//        if (marks > 100 || marks < 0) {
//
//            System.out.println("Invalid Marks");
//
//        } else if (marks >= 90) {
//
//            System.out.println("A");
//
//        } else if (marks >= 80) {
//
//            System.out.println("B");
//        } else if (marks >= 70) {
//
//            System.out.println("C");
//
//        } else if (marks >= 60) {
//
//            System.out.println("D");
//
//        } else if (marks >= 50) {
//
//            System.out.println("E");
//
//        } else {
//
//            System.out.println("FAIL");
//        }
//
//
//        //   }
//
//
//    }
//}
