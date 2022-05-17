package structural.bridge.carengine;

import lombok.*;

// Abstraction Hierarchy
@Getter
@Setter
@AllArgsConstructor
public abstract class Car {
    @NonNull
    private Engine engine;

    private String carName;

    public abstract void drive();
}
