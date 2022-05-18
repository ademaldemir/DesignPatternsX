package structural.composite.techstore;

import java.util.ArrayList;

// Composite or Container
public class Computer implements Part {
    private final ArrayList<Part> listOfComponents = new ArrayList<>();

    public void addComponent(Part newComponent) {
        listOfComponents.add(newComponent);
    }

    public void deleteComponent(Part newComponent) {
        listOfComponents.remove(newComponent);
    }

    @Override
    public int price() {
        int totalPrice = 0;
        for (Part component :
                listOfComponents) {
            totalPrice += component.price();
        }
        return totalPrice;
    }
}
