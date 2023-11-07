package String;

public class Ex1 {
    public static void main(String[] args) {


        String s1 = "Vikings ";

        //String txt = "We are the so-called " "ViKings" " from the north."; giving error
        //String txt = "We are the so-called  "ViKings" from the north.";
        String txt = "We are the so-called \"ViKings\" from the north.";
        String txt2 = "We are the so-called "+ "ViKings" +" from the north.";
        System.out.println(txt);
        System.out.println(txt2);
    }
}
