package accesssmodifier;
// Abstract class Shape
abstract class Shape {
    abstract double calculateArea(); // Abstract method to calculate the area of a shape
}

// Concrete subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0
        Circle circle = new Circle(5.0);

        // Calculate and print the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}


