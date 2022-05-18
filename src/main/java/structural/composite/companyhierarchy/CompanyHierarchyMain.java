package structural.composite.companyhierarchy;

public class CompanyHierarchyMain {
    public static void main(String[] args) {
        Employee jack = new JuniorEngineer(101, "Jack", 5000);
        Employee isabella = new SeniorEngineer(102, "Isabella", 9000);
        Employee travis = new JuniorEngineer(103, "Travis", 5000);
        Employee elon = new TeamLeader(10, "Elon", 15000);

        elon.add(jack);
        elon.add(isabella);
        elon.add(travis);

        elon.print();

    }
}
