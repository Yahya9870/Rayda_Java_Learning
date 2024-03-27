public class DivisionByZeroExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println(STR."Caught ArithmeticException: Cannot divide \{e.getMessage()}");
        }
    }
}
