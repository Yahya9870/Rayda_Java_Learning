public class operator_practice {
    public static void main(String[] args) {
        int z = 35;
        // both ++z or z++ means value of z is getting increased by 1,
        // but the difference is in z++ first the value will get printed then increment takes places
        // whereas in ++z first increment takes place then value gets printed.
//        System.out.println(z++);
//        System.out.println(z);

//        int x=35;
//
//        x+=1; // x=x+1 or x+=1 or x++ or ++x all having same increment
//
//        System.out.println(x);

        int y=35;

        System.out.println(y++); // 35
        System.out.println(--y); // 35
        System.out.println(y);   // 35
        System.out.println(y--); // 35
        System.out.println(++y); // 35
    }
}
