

public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 2022;
        this.color = "Unknown";
        this.price = 0.0;
    }



    // Parameterized constructor with make, model, year
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor with all attributes
    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }


    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car(); // Default constructor
        Car car2 = new Car("Toyota", "Camry", 2020); // Parameterized constructor with make, model, year
        Car car3 = new Car("Honda", "Civic", 2024, "Red", 25000.0); // Parameterized constructor with all attributes

        // Displaying details of each car
        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println();

        System.out.println("Car 2 Details:");
        car2.displayDetails();
        System.out.println();

        System.out.println("Car 3 Details:");
        car3.displayDetails();
    }
}
