package patterns.composite;

import java.util.ArrayList;

public class Supervisor implements Employee {


    private String name;
    private Integer happiness;
    private ArrayList<Employee> subordinated = new ArrayList<Employee>();

    public Supervisor(String name, Integer happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    public void addSubordinate(Employee employee) {
        subordinated.add(employee);
    }

    @Override
    public void showHappiness() {
        System.out.println(name + " showed happiness level of " + happiness);
        subordinated.stream()
                .forEach(Employee::showHappiness);
    }
}
