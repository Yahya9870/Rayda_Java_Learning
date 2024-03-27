public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        try {
            long[] bigArray = new long[Integer.MAX_VALUE];
            System.out.println("Program executes without any exception");
        } catch (OutOfMemoryError e) {
            System.err.println(STR."Caught OutOfMemoryError: \{e.getMessage()}");
        }


    }
}
