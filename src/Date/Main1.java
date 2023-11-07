package Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main1 {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        LocalDate myObj1 = LocalDate.now();// Create a date object
        System.out.println(myObj);
        System.out.println(myObj1);// Display the current date
    }
}
