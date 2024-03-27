// Define an enumeration called Laptop, which represents a set of predefined laptop types
// along with their prices.
enum Laptop {
    // Enum constants are public, static, and final implicitly. Each constant is an instance of Laptop.
    Macbook(2000), XPS(2200), Surface(1500);

    // price is a private field representing the price of the laptop.
    private int price;

    // The Constructor of the enum is private. Enum constants are instantiated with this constructor.
    private Laptop(int price) {
        this.price = price;
    }

    // Public method to get the price of the laptop.
    public int getPrice() {
        return this.price;
    }

    // Public method to set the price of the laptop. This is not typical for enums, as they are usually immutable.
    public void setPrice(int price) {
        this.price = price;
    }

    // Method to increase the price by a given percentage. This modifies the price of the laptop.
    public void increasePrice(float percentage) {
        this.price += this.price * percentage / 100;
    }

    // Static method to print the details of all laptop enums.
    public static void printAllLaptops() {
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop.name() + " costs " + laptop.getPrice());
        }
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Access the price of the Macbook enum constant.
        System.out.println("Original price of Macbook: " + Laptop.Macbook.getPrice());

        // Increase the price of Macbook by 10%
        Laptop.Macbook.increasePrice(10);
        System.out.println("Price of Macbook after 10% increase: " + Laptop.Macbook.getPrice());

        // Change the price of XPS using the setter.
        Laptop.XPS.setPrice(2500);
        System.out.println("New price of XPS: " + Laptop.XPS.getPrice());

        // Print the details of all laptops.
        Laptop.printAllLaptops();
    }
}
