package Input;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");

        // Read the user's name as a string
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");

        // Read the user's age as an integer
        int age = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine();

        // Prompt the user for their favorite color
        System.out.print("Enter your favorite color: ");

        // Read the user's favorite color as a string
        String favoriteColor = scanner.nextLine();

        // Display the user's input
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + favoriteColor + ".");

        // Close the Scanner when done
       // scanner.close();
    }
}

