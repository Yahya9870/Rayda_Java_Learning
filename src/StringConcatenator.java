public class StringConcatenator {

    public static String concatenateStrings(String str1, String str2) {
        // Use the concat method to concatenate the strings
        String concatenatedString = str1.concat(str2);
        return concatenatedString;
    }

    public static void main(String[] args) {
        // Example usage:
        String str1 = "Hello, ";
        String str2 = "World!";
        String concatenatedString = concatenateStrings(str1, str2);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
