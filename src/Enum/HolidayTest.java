package Enum;

enum Holiday {
    NEW_YEAR("January 1"),
    VALENTINES_DAY("February 14"),
    CHRISTMAS("December 25");

    private final String date;

    private Holiday(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}

public class HolidayTest {
    public static void main(String[] args) {
        Holiday christmas = Holiday.CHRISTMAS;
        System.out.println("Date of Christmas: " + christmas.getDate());
    }
}

