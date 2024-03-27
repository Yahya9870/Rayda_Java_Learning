//// Main.java
//
//// Person class representing a generic person
//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String toString() {
//        return "Name: " + name + ", Age: " + age;
//    }
//}
//
//// Student class inheriting from Person
//class Student extends Person {
//    private String studentId;
//
//    public Student(String name, int age, String studentId) {
//        super(name, age);
//        this.studentId = studentId;
//    }
//
//    public String getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    public String toString() {
//        return super.toString() + ", Student ID: " + studentId;
//    }
//}
//
//// Teacher class inheriting from Person
//class Teacher extends Person {
//    private String subject;
//
//    public Teacher(String name, int age, String subject) {
//        super(name, age);
//        this.subject = subject;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String toString() {
//        return super.toString() + ", Subject: " + subject;
//    }
//}
//
//// Employee class inheriting from Person
//class Employee extends Person {
//    private String department;
//
//    public Employee(String name, int age, String department) {
//        super(name, age);
//        this.department = department;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String toString() {
//        return super.toString() + ", Department: " + department;
//    }
//}
//
//// Main class for testing
//public class Inheritance {
//    public static void main(String[] args) {
//        // Create a Person object
//        Person person = new Person("John", 30);
//        System.out.println("Person Details: " + person);
//
//        // Create a Student object
//        Student student = new Student("Alice", 20, "12345");
//        System.out.println("Student Details: " + student);
//
//        // Create a Teacher object
//        Teacher teacher = new Teacher("Jane", 40, "Mathematics");
//        System.out.println("Teacher Details: " + teacher);
//
//        // Create an Employee object
//        Employee employee = new Employee("Mike", 35, "Human Resources");
//        System.out.println("Employee Details: " + employee);
//
//        // Modify student details
//        student.setName("Bob");
//        student.setAge(25);
//        student.setStudentId("54321");
//        System.out.println("Modified Student Details: " + student);
//    }
//}
