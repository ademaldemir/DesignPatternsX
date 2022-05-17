package structural.bridge.shapes;

import lombok.*;

// Abstraction
@Getter
@Setter
@AllArgsConstructor
public abstract class Shape {
    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PRIVATE)
    private Color color;

    public abstract void draw();
}
