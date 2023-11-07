package primitivedatatype;

/* import java.util.Scanner;

public class Box {
    public static void main(String args[]) {
        double length, width, height;

        Scanner input=new Scanner(System.in);

        new Box() {     //

            Box defaultBox=new Box();
            double length = 1.0;
            double width = 1.0;
            double height = 1.0;
    System.out.print("Default dimensions are " + length + " X " + width + " X " + height);
    defaultBox.displayDimensions();
    System.out.println(" with volume of "+defaultBox.calcVolume());

            Box initialBox=new Box(length, width, height);
            length = 8.5;
            width = 11.0;
            height = 1.0;
    System.out.print("Initial dimensions are " + length + " X " + width + " X " + height);
    initialBox.displayDimensions();
    System.out.println(" with volume of "+initialBox.calcVolume());

            Box copyBox=new Box(initialBox);
    System.out.print("Copied dimensions are " + length + " X " + width + " X " + height);
    copyBox.displayDimensions();
    System.out.println(" with volume of "+copyBox.calcVolume());

    System.out.println("\nUpdate dimensions");
    initialBox.inputLength();
    initialBox.inputWidth();
    initialBox.inputHeight();
    System.out.print("Updated dimensions are ");
    initialBox.displayDimensions();
    System.out.println(" with volume of "+initialBox.calcVolume());
        }
        double inputLength() {
            Scanner input;
            double length = input.nextDouble();
        }
        double inputWidth() {
            Scanner input;
            double width = input.nextDouble();
        }
        double inputHeight() {
            Scanner input;
            double height = input.nextDouble();
        }

        double displayDimensions(double length, double width, double height) {
            Scanner input;
        }

        double calcVolume() {
        }

    }
*/

import java.util.Scanner;

public class Box {
    private double length, width, height;

    public Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box otherBox) {
        this.length = otherBox.length;
        this.width = otherBox.width;
        this.height = otherBox.height;
    }

    public double inputLength() {
        Scanner input = new Scanner(System.in);
        length = input.nextDouble();
        return length;
    }

    public double inputWidth() {
        Scanner input = new Scanner(System.in);
        width = input.nextDouble();
        return width;
    }

    public double inputHeight() {
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        return height;
    }

    public void displayDimensions() {
        System.out.println(length + " X " + width + " X " + height);
    }

    public double calcVolume() {
        return length * width * height;
    }

    public static void main(String args[]) {
        Box defaultBox = new Box();
        System.out.print("Default dimensions are ");
        defaultBox.displayDimensions();
        System.out.println(" with volume of " + defaultBox.calcVolume());

        Box initialBox = new Box(8.5, 11.0, 1.0);
        System.out.print("Initial dimensions are ");
        initialBox.displayDimensions();
        System.out.println(" with volume of " + initialBox.calcVolume());

        Box copyBox = new Box(initialBox);
        System.out.print("Copied dimensions are ");
        copyBox.displayDimensions();
        System.out.println(" with volume of " + copyBox.calcVolume());

        System.out.println("\nUpdate dimensions");
        initialBox.inputLength();
        initialBox.inputWidth();
        initialBox.inputHeight();
        System.out.print("Updated dimensions are ");
        initialBox.displayDimensions();
        System.out.println(" with volume of " + initialBox.calcVolume());
    }
}
