package operator;

public class BitAndOrOp {
    public static void main(String[] args) {
        int x = 5;
        x &= 3;//and op with binary of both 5 and 3
        System.out.println(x);

        int y = 5;
        y |=3;
        System.out.println(y);
    }
}
