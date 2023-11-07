package primitivedatatype;

public class ex3 {
    //Integer a ; //calling like object
    static int a = 4;//making it accesible in static main method
    static Integer c = 5;

    public static void main(String[] args) {
        //ex3 obj= new ex3();
        //obj.a=3;
        Integer b=a;//auto convert to int
        int d=c;
        //System.out.println(obj.a);//not static
        System.out.println(b);
        System.out.println(d);

    }
}//

