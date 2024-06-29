// Example class representing a Product
public class Product {
    // Data fields or Instance Variables
    private String name;        // Name of the product
    private double price;       // Price of the product
    private int quantity;       // Available quantity in stock
    private boolean inStock;    // Indicates if the product is in stock

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

    // Method to increase the quantity of the product
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    // Method to decrease the quantity of the product
    public void decreaseQuantity(int amount) {
        if (amount <= this.quantity) {
            this.quantity -= amount;
        } else {
            System.out.println("Insufficient quantity!");
        }
    }

    // Method to check if the product is low in stock
    public boolean isLowInStock() {
        return quantity < 10;   // Example threshold for low stock
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("In Stock: " + (inStock ? "Yes" : "No"));
    }

    // Example main method to test the Product class
    public static void main(String[] args) {
        // Create a new Product instance
        Product product = new Product();

        // Set properties using setters
        product.setName("Laptop");
        product.setPrice(999.99);
        product.setQuantity(50);
        product.setInStock(true);

        // Display product details
        product.displayProductDetails();

        // Example usage of methods
        product.increaseQuantity(10);
        System.out.println("Quantity after increase: " + product.getQuantity());

        product.decreaseQuantity(5);
        System.out.println("Quantity after decrease: " + product.getQuantity());

        // Check if product is low in stock
        System.out.println("Low in stock: " + product.isLowInStock());
    }
}
