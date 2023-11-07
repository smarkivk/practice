package method.staticcheck;

class CounterStatic {
    static int count = 0;  // Static variable to count instances

    public CounterStatic() {
        count++;  // Increment count when an instance is created
   }
}

public class StaticExample {
    public static void main(String[] args) {
        CounterStatic obj1 = new CounterStatic();
        CounterStatic obj2 = new CounterStatic();

        System.out.println("Number of instances created: " + CounterStatic.count);
    }
}
