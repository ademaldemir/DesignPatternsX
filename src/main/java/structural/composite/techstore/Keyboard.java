package structural.composite.techstore;

// Leaf
public class Keyboard implements Part {
    @Override
    public int price() {
        return 100;
    }
}
