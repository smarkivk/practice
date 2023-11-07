package Recursion;

public class FibonacciCalculator {
    public static void main(String[] args) {
        int n = 10; // Change this to the desired position in the Fibonacci sequence
        long result = calculateFibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is " + result);
        System.out.println("Fibonacci number at position " + n + " is " + calculateFibonacci(n));
    }

    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // Recursive case
        }
    }
}

