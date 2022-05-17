package structural.bridge.shapes;

public class Rectangle extends Shape {
    public Rectangle(Color drawAPI) {
        super(drawAPI);
    }

    // Refined Abstraction
    @Override
    public void draw() {
        System.out.println("Rectangle".concat(" with ").concat(getDrawAPI().color()));
    }
}
