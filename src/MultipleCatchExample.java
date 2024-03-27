public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; // This will throw an ArithmeticException

            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException


        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.err.println("Some other exception occurred.");
        }
    }
}
