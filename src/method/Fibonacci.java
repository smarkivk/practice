package method;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Change this value to calculate Fibonacci numbers up to a different position
        System.out.println("Fibonacci sequence up to position " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: F(n) = F(n-1) + F(n-2)
        }
    }
}

