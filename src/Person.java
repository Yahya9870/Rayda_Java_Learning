//Encapsulation Example:

 class Person1 {
    private String name; // Private field
    private int age;     // Private field

    // Public constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public methods to access and modify private fields (getters and setters)
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
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}


/***In this example:

 The name and age fields are private, encapsulating the internal state of the Person1 object.
 Public getter and setter methods (getName(), setName(), getAge(), setAge()) provide controlled access to the private fields, allowing external code to read and modify the object's state in a controlled manner.
 Benefits of Encapsulation:
 Data Security: Private fields cannot be accessed directly, ensuring data security and preventing accidental modification.

 Flexibility: By providing getter and setter methods, we can enforce validation logic, compute derived values, or trigger actions whenever a field is accessed or modified.

 Maintenance: Encapsulation simplifies maintenance by localizing changes within the class, reducing the impact of changes on other parts of the program.

 Encapsulation is a crucial concept in Java programming, and understanding it thoroughly is essential for writing robust and maintainable code.
 ************************/
