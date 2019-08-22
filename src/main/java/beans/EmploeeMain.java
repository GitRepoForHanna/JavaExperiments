package beans;

import java.util.*;

public class EmploeeMain {

    public static void main(String[] args) {





        List<Employee> employees = hireEmplyees();

        employees.stream()
                .filter(e -> e.getLevel() > 2)
                .map(g -> g.getDepartment())
                .distinct()
                .sorted(Comparator.comparing(e -> e.getName()))
                .forEach(System.out::println);

        System.out.println("Average age: " +
                employees.stream()
                .mapToInt(Employee::getAge)
                .summaryStatistics()
        );

    }

    public static List<Employee> hireEmplyees() {
        Department financialDepartment = new Department("Financial department");
        Department backendDepartment = new Department("Backend department");

        return Arrays.asList(new Employee(19, "Vasiliy", "java",1, financialDepartment),
                new Employee(20, "Petr", ".NET", 3, financialDepartment),
                new Employee(38, "Johan", "Delphi", 5, backendDepartment),
                new Employee(45, "Sergey", "Java", 2, backendDepartment));
    }
}
