package Enum;

enum Level3 {
    LOW,MEDIUM,high //its not case sensitive
}

public class Main3 {
    public static void main(String[] args) {
        for (Level3 myVar : Level3.values()) {//values calls enum values
            System.out.println(myVar);
        }
    }
}

