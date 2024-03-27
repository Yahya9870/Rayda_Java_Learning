import java.util.Scanner;

public class PseudoCode1 {
    public static void main(String[] args) {

      //  Read N numbers and print the array.

        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        int[] ARRAY =new int[N];

        for (int index = 0; index <N ; index++) {
            ARRAY[index]= sc.nextInt();   // read entire ARRAY N elements.
        }

        for (int index = 0; index <N ; index++) {

            System.out.println(ARRAY[index]);

        }

        

        //read matlab scan input lena.
        //write matlab print output dena.

    }
}
