package structural.composite.companyhierarchy;

// Leaf
public class SeniorEngineer extends Employee {
    /*
         In this class,there are many methods which are not applicable to Junior Engineer because
         it is a leaf node.
     */
    public SeniorEngineer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    void print() {
        System.out.println("==========================");
        System.out.println("Id = " + getId());
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("==========================");
    }

    @Override
    void add(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    @Override
    void remove(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    @Override
    Employee getChild(int index) {
        //this is leaf node so this method is not applicable to this class.
        return null;
    }
}
