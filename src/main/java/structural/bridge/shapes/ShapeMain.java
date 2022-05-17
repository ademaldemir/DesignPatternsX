package structural.bridge.shapes;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circleBlue = new Circle(new BlueShape());
        Shape rectangleRed = new Rectangle(new RedShape());

        circleBlue.draw();
        rectangleRed.draw();
    }
}
