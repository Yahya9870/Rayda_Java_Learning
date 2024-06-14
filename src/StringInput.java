import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello Pls enter any message: ");
        String str=input.next(); // this is how we take input of string

        System.out.println(str);
    }
}
