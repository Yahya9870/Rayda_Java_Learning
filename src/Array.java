import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Write a Java Program to store GPA of 100 students.

        //Method 1:
             // create 100 variable and store
           // int student1GPA, student2GPA, ...................., student100GPA; (it takes a huge chunk of time even for a nonsense thing).

        //Method 2:
           // Create a single Unit that stores GPA of 100 students in unit.

        // CASE A: You have put 5 keys in different location at your house like living room, backyard, kitchen, terrace and balcony.
        // CASE B: You have put 5 keys in a box. (This is an example of Array).

        // In which of the aforementioned cases when I will ask you for a specific key you will able to give quickly.

        /*------------------------------------------------ARRAYS-----------------------------------------------------*/

       //It is a data structure, that stores similar kind of data.
        // DataStructure: A structure in which we can store our data.
        // RealLife Example: For Human Beings what would be our HumanStructures: Human Structure is something that stores Humans for example apartments, Villas, Mansions, semi-detached houses, farm houses, manner and so on.

        // Syntax of Array

         // datatype [] identifier name = new datatype[size of the array];
        //   int [] arr=new int[5];

        // Let's create an actual array now.

           int [] arr=new int[5];  // we have created an array with name and size arr and 5 respectively.
           arr[0]=10;
           arr[1]=20;
           arr[2]=30;
           arr[3]=40;
           arr[4]=50;
           arr[3]=100; // OverWritten  // The last you updated that value will get stored in the array.

        int [] arr1={8,9,2,3,4,5,7,10,25,36,47,88,80,99,100,0,1,6};
        // we can use length function to calculate size of the array.

       // int length=  arr1.length; // (arr1.length return an integer literal)

        //System.out.println("The length of the array named arr1 is: "+length);

        // How to display an Array.

        // Method 1 with for loop.

        System.out.println("The display of the array through for loop");

        for (int index = 0; index <arr1.length ; index++) {

            System.out.print(arr1[index]+" ");

        }

        System.out.println();  // changes the line at output

        System.out.println("The Display of the array through while loop");

        int j=0;

        while(j< arr1.length){


            System.out.print(arr1[j]+" ");

            j++;

        }

        // For-each or Enhanced for loop.

        System.out.println();  // Line changer

        System.out.println("Display of the array through enhanced for loop");

        for(int x:arr1){

            System.out.print(x+" ");
        }


        System.out.println();


        // Without loop display of array.

        System.out.println("Display of the array without any loop");



        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));










    }
}
