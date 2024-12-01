public class Student {
    String name;
    int age;
    String studentId;
    String major;

    // Constructor with 2 parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with 4 parameters
    Student(String name, int age, String studentId, String major) {
        this(name, age); // Calls the constructor with 2 parameters
        this.studentId = studentId;
        this.major = major;
    }

    // Method to display basic student information
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}
