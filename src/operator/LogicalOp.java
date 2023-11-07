package operator;

public class LogicalOp {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

        System.out.println(x > 6 && x < 10);

        System.out.println(x > 6 && x <= 5);

        System.out.println(x > 3 || x < 4);

        System.out.println(x > 6 || x < 7);

        System.out.println(x > 6 || x < 4);

        System.out.println(!(x > 3 && x < 10));
    }
}

