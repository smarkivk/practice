package Recursion;
public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);//reference accesed from other static context
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive case
        }
    }
}
