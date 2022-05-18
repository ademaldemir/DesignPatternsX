package structural.composite.techstore;

public class MainTechStore {
    public static void main(String[] args) {
        Part monitor = new Monitor();
        Part keyboard = new Keyboard();
        Part mouse = new Mouse();
        Part ram = new Ram();

        Computer computer = new Computer();
        computer.addComponent(monitor);
        computer.addComponent(mouse);
        computer.addComponent(keyboard);
        computer.addComponent(ram);

        System.out.println("Total Price : " + computer.price());
    }
}
