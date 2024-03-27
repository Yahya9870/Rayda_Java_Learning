//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
//import java.util.Scanner;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        // Syntax of declaring an ArrayList:
        // Arraylist<data type from Wrapper classes> nameOfList = new ArrayList<data type>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // Adding elements in ArrayList.
        list.add(1); // index 0
        list.add(2); // index 1
        list.add(3); // index 2
        list.add(4); // index 3
        list.add(5); // index 4 --> 5
        list.add(6); // index 5
        // Displaying of ArrayList
        System.out.println(list); // no for loop is required like array ypu can directly print it out.

        // To get an element from arrayList.

        System.out.println("The specified value of arrayList is "+list.get(4));

        // How to add element in specific index.

        list.add(4,10);

        System.out.println("Update arrayList is "+list);

        // Set elements

        list.set(0,100);
        System.out.println("Modified ArrayList is "+list);


        // Deleting element from the list.

        list.remove(4);

        System.out.println(list);

        // How to obtain size of the arrayList
        int size= list.size();
        System.out.println("The size of out arrayList is: "+size);

        // Loops on list
        for (int i = 0; i <list.size() ; i++) {

            System.out.print(list.get(i)+" ");

        }

        System.out.println();

        // Sorting of List

        Collections.sort(list);

        System.out.println("Our list is sorted in ascended order: ");
        System.out.println(list);




    }
}
