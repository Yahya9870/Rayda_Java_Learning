// Custom checked exception
class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }
}

public class MyCheckedException {
    public static void main(String[] args) {
        try {
            checkValue(10);
        } catch (CheckedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkValue(int value) throws CheckedException {
        if (value < 0) {
            throw new CheckedException("Value cannot be negative.");
        } else if (value == 10) {
            throw new CheckedException("Value cannot be 10.");
        }
        System.out.println("Value is fine: " + value);
    }
}
