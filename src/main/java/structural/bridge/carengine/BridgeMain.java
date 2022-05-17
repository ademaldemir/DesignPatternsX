package structural.bridge.carengine;

public class BridgeMain {
    public static void main(String[] args) {
        Car mercedes = new Mercedes(new SportEngine(), "Mercedes");
        Car bmw = new BMW(new ClassicEngine(), "BMW");
        Car audi = new Audi(new SportEngine(), "Audi");

        mercedes.drive();
        bmw.drive();
        audi.drive();
    }
}
