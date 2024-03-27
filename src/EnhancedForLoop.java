/**Name
     Student ID:
*/




public class EnhancedForLoop {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,14,18,17,80,90,100};

        String [] str= {"Rayda", "Sara", "Hajar", "Ali", "Salmaan", "Mohammad"};
        if(args.length==0){

            System.out.println("No Command Line Arguments");
        }

        else{

            for (int i = 0; i < args.length ; i++) {

                System.out.print(args[i]+" ");

            }
        }


//        for(String ele: str){
//
//            System.out.print(ele+" ");
//        }

        System.out.println();  // line changer

        // Enhanced for loop or For each loop.

//        for(int elements: arr){
//            System.out.print(elements+" ");
//        }
    }
}
