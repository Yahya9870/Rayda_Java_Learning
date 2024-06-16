public class Java_Method_02 {
    // If all methods no matter 2 or 100 are written inside same class then they can be called or accessed even if private access modifier is there.
    public static void main(String[] args) {
        // Example usage of the sum method with 3 integers
        int ans = sum(10, 20, 30);
        System.out.println("The sum of 3 integers is: " + ans);

        // Example usage of the average method with 3 integers
        double ans1 = average(10, 20, 30);
        System.out.println("The average of 3 integers is: " + ans1);

        // Example usage of the something method
        String str = something();
        System.out.println(str);
    }

    // Returning and parametrized method
    // Write a method that takes 3 integers and returns the sum of them
    private static int sum(int a, int b, int c) {
        return a + b + c; // Returning the sum of three integers
    }

    // Write a method that takes 3 integers and returns the average of them
    private static double average(int a, int b, int c) {
        return (a + b + c) / 3.0; // Returning the average of three integers
    }

    // Returning and non-parametrized method
    // Write a method that displays some numbers
    private static String something() {
        int a = 10;
        int b = 20;
        int c = a * b;
        return "The product of 10 and 20 is: " + c; // Returning a string with the product
    }
}

/**Additional Notes
Parameter vs. Argument: A parameter is a variable in the method definition.
 An argument is the actual value passed to the method when it is called.

Return Type: Specifies what type of value the method will return.
 If a method does not return any value, it uses the void keyword.

Method Invocation/calling: When you call a method, you provide arguments that correspond to the method’s parameters. **/