 class Student {
    // Private fields
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}

public class StudentManager {
    public static void main(String[] args) {
        // Creating a new instance of Student
        Student student = new Student();
        student.setName("Alice"); // Setting the name using setter
        student.setAge(20); // Setting the age using setter

        // Displaying the student's information using getters
        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());

        // Updating the student's information
        student.setName("Bob");
        student.setAge(22);

        // Displaying updated information
        System.out.println("Updated Name: " + student.getName() + ", Updated Age: " + student.getAge());
    }
}
