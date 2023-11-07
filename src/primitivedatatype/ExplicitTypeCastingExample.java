package primitivedatatype;

public class ExplicitTypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 15.75;
        int intValue = (int) doubleValue; // Explicit typecasting from double to int

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Explicitly casted int value: " + intValue);

        char charValue = 'A';
        //int asciiValue = (int) charValue; // Explicit typecasting from char to int
        //char asciiValue = (char) charValue;
        int asciiValue = (int) charValue ; // here asci value of
        System.out.println("Original char value: " + charValue);
        System.out.println("ASCII value after explicit casting: " + asciiValue);
    }
}
