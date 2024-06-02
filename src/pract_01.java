public class pract_01 {
    public static void main(String[] args) {
        // print all numbers between 1 to 10

        System.out.println("All the numbers between 1 to 10:  ");
        for (int i = 1; i <=10 ; i++) {

            System.out.println(i);

        }

        // print all even numbers between 1 to 10:

        System.out.println("All even numbers between 1 to 10:  ");

        for (int i = 1; i <=10 ; i++) {

            if (i%2==0){
                System.out.println(i);
            }

        }

        // print all odd numbers between 1 to 10:

        System.out.println("All odd numbers between 1 to 10:  ");
        for (int i = 1; i <=10 ; i++) {

            if(i%2==1){
                System.out.println(i);
            }

        }
    }
}
