public class StringParsingExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("not a number");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.err.println(STR."Caught NumberFormatException: \{e.getMessage()}");
        }

//        String str1="Raydaa";
//        String str2="Sara";
//
//        int a=Integer.parseInt(str1);
//        int b=Integer.parseInt(str2);
//
//        System.out.println(a+b);

    }
}
