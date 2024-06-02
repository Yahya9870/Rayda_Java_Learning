public class IfElsePractice03 {
    public static void main(String[] args) {
                int age = 105;

        if (age < 0 || age>130) {

            System.out.println("Invalid age!!!!");
        } else if (age < 18) {

            System.out.println("You are a minor");

        } else if (age <= 40 ) {

            System.out.println("You are a young individual");

        } else if (age < 61) {

            System.out.println("You are a middle aged man or woman");

        } else if (age <= 100 ) {

            System.out.println("You are between oldness and extreme oldness ");
        } else { // by default

            System.out.println("You are 100+");

        }
    }
}
