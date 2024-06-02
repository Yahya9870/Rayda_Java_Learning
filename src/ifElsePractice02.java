public class ifElsePractice02 {
    public static void main(String[] args) {
        // Develop a java program with a given age and income and return whether or not they are eligible for the pension.
//            // For eligibility of pension age must greater than 60 and income should be less than 100,000 dollars, height should be less than 6 feet.
//            // Nested if else statements
        int age=61;
        int income=50000;
        int height=5;

        if(age>60){
            if(income<100000){
                if(height<6){
                    System.out.println("Congrats you are eligible for pension");
                }
                else {
                    System.out.println("Sorry No pension");
                }
            }

            else {
                System.out.println("Sorry No pension");
            }
        }

        else{
            System.out.println("Sorry No pension");
        }


    }
}
