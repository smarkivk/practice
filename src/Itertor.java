// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Itertor {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> my = cars.iterator();//( my )name is iteartor

        // Print the first item
        System.out.println(my.next());
        //System.out.println(my.notifyAll());
    }
}
