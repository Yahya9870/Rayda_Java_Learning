import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        Random random = new Random();

        int num=random.nextInt(6)+1; // it will generate a random number between 1 to 6

        System.out.println(num);
    }
}
