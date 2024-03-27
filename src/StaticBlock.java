public class StaticBlock {

    static {

       System.out.println("If it showing above Main method its means\nExecuted Before main");
   }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
