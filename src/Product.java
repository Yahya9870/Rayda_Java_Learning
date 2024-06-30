// Example class representing a Product
public class Product {

    // Example main method to test the Product class
    public static void main(String[] args) {
        // Create a new Product instance/object
        ABC obj = new ABC();

        // Set properties using setters
        obj.setName("Laptop");
        obj.setPrice(1000.0);
        obj.setQuantity(50);
        obj.setInStock(true);

        // Display obj details
        obj.displayProductDetails();

        // Example usage of methods
//        obj.increaseQuantity(30);
//        System.out.println("Quantity after increase: " + obj.getQuantity());

        obj.decreaseQuantity(49);
        System.out.println("Quantity after decrease: " + obj.getQuantity());

        // Check if obj is low in stock
        System.out.println("Low in stock: " + obj.isLowInStock());
    }
}


class ABC{
    // Data fields or Instance Variables
    private String name;        // Name of the obj
    private double price;       // Price of the obj
    private int quantity;       // Available quantity in stock
    private boolean inStock;    // Indicates if the obj is in stock

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter for inStock
    public boolean getIsInStock() {
        return inStock;
    }

    // Setter for inStock
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // Method to increase the quantity of the obj
    public void increaseQuantity(int amount) {
        this.quantity += amount; // this.quantity=this.quantity+amount;
        // int a=10;
        // you have to increase this value by a certain amount say x.
        // Step 1: a=a+x; // old way of programming but still we can use it it does not give errors.
        // Step 2: a+=x; // new way


    }

    // Method to decrease the quantity of the obj
    public void decreaseQuantity(int amount) {
        if (amount <= this.quantity) {
            this.quantity -= amount; // this.quantity=this.quanity-amount;
        } else {
            System.out.println("Insufficient quantity!");
        }
    }

    // Method to check if the obj is low in stock
    public boolean isLowInStock() {
        return quantity < 10;   // Example threshold for low stock
    }

    // Method to display obj details
    public void displayProductDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("In Stock: " + inStock);
    }

}

// Keep the program as it is however rather than giving hardcode values you have ask user input and then assign
// those values to the respective methods.
