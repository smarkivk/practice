package encapsulation;

public class Main {
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
