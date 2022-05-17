package structural.bridge.carengine;

import lombok.NonNull;

public class Mercedes extends Car{
    public Mercedes(@NonNull Engine engine, String carName) {
        super(engine, carName);
    }

    @Override
    public void drive() {
        System.out.println(getCarName().concat(" with: ").concat(getEngine().startEngine()));
    }
}
