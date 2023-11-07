package method;



public class StaticMyClassEx {
    static int count = 0;  // Static variable

    public StaticMyClassEx() {
        count++;

            // Accessing static variable


    }

    public static void main(String[] args) {
        int num = StaticMyClassEx.count;
        System.out.println("count"+num);
    }
}

