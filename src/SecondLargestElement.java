public class SecondLargestElement {

    // Method to find the second-largest element in an array
    public static int findSecondLargest(int[] arr) {
        // Check if the array has at least two elements
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // indicating an error
        }

        // Initialize variables to store the largest and second-largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second-largest elements
        for (int num : arr) {
            if (num > largest) {
                // If the current number is larger than the current largest, update both
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // If the current number is greater than the current second largest (but not equal to largest), update second largest
                secondLargest = num;
            }
        }

        // Return the second-largest element
        return secondLargest;
    }

    public static void main(String[] args) {
        // Sample array
        int[] array = {10, 5, 8, 20, 7};

        // Call the findSecondLargest method and store the result
        int result = findSecondLargest(array);

        // Check if the result is not -1 (indicating an error) and print the second largest element
        if (result != -1) {
            System.out.println("Second largest element: " + result);
        }
    }
}
