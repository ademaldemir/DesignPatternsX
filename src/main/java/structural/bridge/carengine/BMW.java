package structural.bridge.carengine;

import lombok.NonNull;

public class BMW extends Car{
    public BMW(@NonNull Engine engine, String carName) {
        super(engine, carName);
    }

    @Override
    public void drive() {
        System.out.println(getCarName().concat(" with: ").concat(getEngine().startEngine()));
    }
}
