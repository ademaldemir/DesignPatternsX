package structural.bridge.shapes;

public class Circle extends Shape {
    public Circle(Color drawAPI) {
        super(drawAPI);
    }

    // Refined Abstraction
    @Override
    public void draw() {
        System.out.println("Circle".concat(" with ").concat(getColor().color()));
    }
}
