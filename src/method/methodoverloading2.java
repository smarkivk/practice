package method;

//package method;

public class methodoverloading2 {
    static int z=5;
    public  int plusMethodInt(int x, int y  ) {
       //static to access
        return x + y;
    }

    public  double plusMethodDouble(double x, double y) {
        return x + y;
    }
    /*public methodoverloading2();
    {
        public  int plusMethodInt(int x, int y;
        public  double plusMethodDouble(double x, double y)

    }*/

    public static void main(String[] args) {
        methodoverloading2 A =new methodoverloading2();
        methodoverloading2 B = new methodoverloading2();
        //int myNum1 = A.plusMethodInt()(8, 5);
        //double myNum2 = B.plusMethodDouble()(4.3, 6.26);
        System.out.println("int: " + A.plusMethodInt(8,5));
        System.out.println("double: " + A.plusMethodDouble(4.3,6.26));

        System.out.println("z"+B.z);
    }
}

