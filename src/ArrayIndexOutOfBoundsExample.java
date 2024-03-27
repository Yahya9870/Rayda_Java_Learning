import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[30]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(STR."Caught ArrayIndexOutOfBoundsException: \{e.getMessage()}");
        }

        //This is he case without exception handling and we got ArrayIndexOutOfBoundsException

//        int [] arr = new int[5];
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            arr[i]= sc.nextInt();
//
//        }
//
//        System.out.println(arr[50]);
    }
}
