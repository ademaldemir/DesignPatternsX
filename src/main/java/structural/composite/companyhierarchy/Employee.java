package structural.composite.companyhierarchy;

import lombok.*;

// Component
@Data
@AllArgsConstructor
public abstract class Employee {
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private int id;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private String name;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private double salary;

    abstract void print();
    abstract void add(Employee employee);
    abstract void remove(Employee employee);
    abstract Employee getChild(int index);
}
