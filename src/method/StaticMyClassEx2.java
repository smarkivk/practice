package method;


public class StaticMyClassEx2 {
    static int count = 0;  // Static variable

    public StaticMyClassEx2() {
        count++;

        // Accessing static variable


    }

    public static void main(String[] args) {
        //int num = StaticMyClassEx.count;
        //System.out.println("count"+num);//countfrom ither class is also accesible
        //int num = StaticMyClassEx2.count;
        //System.out.println("count"+num);
        StaticMyClassEx2 obj = new StaticMyClassEx2();
        System.out.println("count"+obj.count);

    }
}//doubt how count1 we get
