package structural.composite.companyhierarchy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamLeader extends Employee {
    List<Employee> employees = new ArrayList<>();

    public TeamLeader(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    void print() {
        System.out.println("==========================");
        System.out.println("Id = " + getId());
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("==========================");

        for (Employee employee : employees) {
            employee.print();
        }
    }

    @Override
    void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    Employee getChild(int index) {
        return employees.get(index);
    }
}
