package method.staticcheck;

class CounterNonStatic {
    int count = 0;  // Non-static variable to count instances

    public CounterNonStatic() {
        count++;  // Increment count when an instance is created
    }
}

public class NonStaticExample {
    public static void main(String[] args) {
        CounterNonStatic obj1 = new CounterNonStatic();
        CounterNonStatic obj2 = new CounterNonStatic();

        System.out.println("Number of instances created: " + obj1.count);
    }
}

