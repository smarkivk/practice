package encapsulation;

public class Student {
    private String name; // Private variable

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Getter method to access the private variable
    public String getName() {
        return name;
    }

    // Setter method to modify the private variable
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student("Alice");

        // Access the private variable using the getter method
        String studentName = student.getName();
        System.out.println("Student name: " + studentName);

        // Modify the private variable using the setter method
        student.setName("Bob");
        System.out.println("Updated student name: " + student.getName());
    }
}

