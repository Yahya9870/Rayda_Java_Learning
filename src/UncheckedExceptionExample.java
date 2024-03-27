public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            printAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(STR."Exception caught: \{e.getMessage()}");
        }
    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println(STR."Your age is: \{age}");
    }
}
