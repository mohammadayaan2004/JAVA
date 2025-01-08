class Shape {
    public double area() {
        // Default implementation, can be overridden by subclasses
        return 0;
    }
}

// Triangle class inherits from Shape
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override the area method for Triangle
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Circle class inherits from Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method for Circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }
}

// Rectangle class inherits from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the area method for Rectangle
    @Override
    public double area() {
        return length * width;
    }
}

// Main class to execute and test the program
public class labQ10 {
    public static void main(String[] args) {
        // Creating objects of each shape and displaying their area

        // Triangle with base = 5 and height = 10
        Triangle triangle = new Triangle(5, 10);
        System.out.println("Area of Triangle: " + triangle.area());

        // Circle with radius = 7
        Circle circle = new Circle(7);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Radius of Circle: " + circle.getRadius());

        // Rectangle with length = 4 and width = 6
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
