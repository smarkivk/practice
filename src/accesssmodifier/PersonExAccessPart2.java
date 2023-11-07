package accesssmodifier;

//package accesssmodifier;

public class PersonExAccessPart2 {
    public static void main(String[] args) {
        // Create an instance of the PersonExAccess class
        PersonExAccess person = new PersonExAccess();

        // Set the name using the setter
        person.setName("John Doe");

        // Get the name using the getter and print it
        System.out.println("Name: " + person.getName());
    }
}
