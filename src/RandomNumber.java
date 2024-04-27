import java.util.Random;

public class RandomNumber{


    public static void main(String[] args) {
        Random random = new Random(); // Creation of an object from Random inbuilt class of java.

        int n=10;

        for (int i = 0; i < n; i++) {

            int num= random.nextInt(100); // It will generate a random number between 0 to 99

            System.out.printf("The random number generated is %d\n",num);
            
        }

       
    }
}
