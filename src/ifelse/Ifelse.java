package ifelse;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
       // int time = 22;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the time ");
        int time1 =scanner.nextInt();

        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 18) {
            System.out.println("Good afternoon.");
        }  else if (time1<=24) {
            System.out.println("Good evening.");
        }
        else  {
            System.out.println("kaha ho bhai");
        }
    }
}