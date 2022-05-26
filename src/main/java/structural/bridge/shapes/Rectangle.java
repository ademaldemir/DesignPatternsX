package structural.bridge.shapes;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    // Refined Abstraction
    @Override
    public void draw() {
        System.out.println("Rectangle".concat(" with ").concat(getColor().color()));
    }
}
