package Enum;

enum Level2 {
    LOW,
    MEDIUM,
    HIGH
}

public class Main2 {//why name change from main to main2

    public static void main(String[] args) {
        Level2 myVar = Level2.MEDIUM;//what is myVar-> obj of Level12(wrong) we are putting value of MEDIUM to myVar

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
