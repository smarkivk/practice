package String;

public class IndexOfExample {
    public static void main(String[] args) {
        String text = "Hello, how are you ?";
        //String text = "Hello, how are you World ?"; why can it read whole world not only w

        int index1 = text.indexOf("how");
        int index2 = text.indexOf("are");
        int index3 = text.indexOf("world"); // Returns -1 if not found

        System.out.println("Index of 'how': " + index1);
        System.out.println("Index of 'are': " + index2);
        System.out.println("Index of 'world': " + index3);
    }
}
