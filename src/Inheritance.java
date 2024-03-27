// Parent class
class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String nationality;
    private String occupation;
    private double height;
    private double weight;

    // Constructor
    public Person(String name, int age, String gender, String address, String phoneNumber,
                  String email, String nationality, String occupation, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.nationality = nationality;
        this.occupation = occupation;
        this.height = height;
        this.weight = weight;
    }

    // Getter and setter methods for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Nationality: " + nationality);
        System.out.println("Occupation: " + occupation);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }
}

// Child class inheriting from Person
class Employee extends Person {
    private String company;
    private String department;
    private String position;
    private double salary;
    private int employeeId;

    // Constructor
    public Employee(String name, int age, String gender, String address, String phoneNumber,
                    String email, String nationality, String occupation, double height, double weight,
                    String company, String department, String position, double salary, int employeeId) {
        super(name, age, gender, address, phoneNumber, email, nationality, occupation, height, weight);
        this.company = company;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    // Getter and setter methods for additional fields
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Method overriding
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling parent class method
        System.out.println("Company: " + company);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 30, "Male", "123 Main St", "123-456-7890",
                "john.doe@example.com", "American", "Software Engineer",
                175.0, 75.0, "ABC Company", "IT", "Senior Developer",
                80000.0, 1001);

        // Display employee details
        emp.displayDetails();

        // Update employee information
        emp.setSalary(85000.0);
        emp.setPosition("Lead Developer");

        // Display updated details
        System.out.println("\nAfter Update:");
        emp.displayDetails();
    }
}
