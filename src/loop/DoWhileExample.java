package loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (0 to exit): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum of the numbers: " + sum);
        //scanner.close();
    }
}

