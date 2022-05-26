package structural.bridge.shapes;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    // Refined Abstraction
    @Override
    public void draw() {
        System.out.println("Circle".concat(" with ").concat(getColor().color()));
    }
}
