package Boolean;


import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int myAge = 25;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        int votingAge = 18;
        System.out.println("Am I eligible to vote? " + (myAge >= votingAge)); // returns true (25 year olds are allowed to vote!)
        System.out.println("Is the entered age eligible to vote? " + (age >= votingAge));
    }
}
