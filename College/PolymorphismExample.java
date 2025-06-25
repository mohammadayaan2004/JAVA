class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape; // Reference of parent class
        shape = new Circle(); // Object of Circle
        shape.draw();
        shape = new Square(); // Object of Square
        shape.draw();
    }
}