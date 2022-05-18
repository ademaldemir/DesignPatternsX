package structural.composite.techstore;

// Leaf
public class Monitor implements Part {
    @Override
    public int price() {
        return 500;
    }
}
