//import java.util.Scanner;
//
//// Define an enumeration called Laptop, which is used to represent a set of laptop types
//// with predefined price values.
//enum Laptop {
//    // Enum constants are public, static, and final implicitly. Each constant is an instance of Laptop.
//    Macbook(2000), XPS(2200), Surface(1500);
//
//    // price is a private field representing the price of the laptop.
//    private int price;
//
//    // Constructor for the enum instances. It is private because enum constants
//    // can only be instantiated within the enum definition.
//    private Laptop(int price) {
//        this.price = price;
//    }
//
//    // Public method to get the price of the laptop.
//    public int getPrice() {
//        return this.price;
//    }
//
//    // Public method to set the price of the laptop. This is not typical for enums, as they are usually immutable.
//    public void setPrice(int price) {
//        this.price = price;
//    }
//}
//
//public class EnumExample2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Iterate over each laptop type
//        for (Laptop laptop : Laptop.values()) {
//            System.out.println("Current price of " + laptop.name() + " is: " + laptop.getPrice());
//            System.out.print("Enter the new price for " + laptop.name() + ": ");
//
//            // Read the new price from the user
//            int newPrice = scanner.nextInt();
//
//            // Set the new price for the laptop
//            laptop.setPrice(newPrice);
//        }
//
//        // After updating, print the new prices
//        System.out.println("\nUpdated laptop prices:");
//        for (Laptop laptop : Laptop.values()) {
//            System.out.println(laptop.name() + " costs " + laptop.getPrice());
//        }
//
//        // Close the scanner
//        scanner.close();
//    }
//}
