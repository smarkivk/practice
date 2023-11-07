import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Using lambda expression
        Arrays.sort(names, (a, b) -> a.compareTo(b));

        // Using method reference
        Arrays.sort(names, String::compareTo);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
