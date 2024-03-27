public class InvalidMethodArgumentExample {
    static int calculateSquare(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return number * number;
    }

    public static void main(String[] args) {
        try {
            int result = calculateSquare(5);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.err.println(STR."Caught IllegalArgumentException: \{e.getMessage()}");
        }
    }
}
