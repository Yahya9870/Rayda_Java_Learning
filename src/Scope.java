public class Scope {
    public static void main(String[] args) {
        { // scope locally declared

            int x=10;
            int y=20;
            System.out.println(x+y);


        }

        { // locally declared
            int x=30;
            int y =40;
            System.out.println(x+y);

        }
        // globally declared
        int x=11;
        int y=22;
        System.out.println(x+y);
    }
}
