import java.util.ArrayList;
import java.util.Scanner;

public class RevArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter the number of elements you want to store: ");
     //   int n = sc.nextInt();

        // In ArrayLists you dont have required to ask user for its size bcoz in arrayList the memory is dynamic in nature,
        // that means it can grow and shrink according to the need.

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        System.out.println("Enter the elements of the ArrayList: ");
        while(sc.hasNextInt()){

            arrList.add(sc.nextInt());

        }
//        for (int i = 0; i < n; i++) {
//            // Reading ArrayList elements from the user
//            arrList.add(sc.nextInt());
//        }
        sc.close(); // Closing the scanner object

        reverse(arrList);

        // Printing the reversed ArrayList

        System.out.println("Reversed arrayList is: "+arrList);
//        for (int element : arrList) {
//            System.out.print(element + " ");
//        }
    }

    public static void reverse(ArrayList<Integer> arrList) {
        int i = 0;
        int j = arrList.size() - 1;

        while (i < j) {
            // Swapping using a temporary variable
            int temp = arrList.get(i);
            arrList.set(i, arrList.get(j));
            arrList.set(j, temp);
            i++;
            j--;
        }
    }
}
