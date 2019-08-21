package beans;

import java.util.*;

public class EmploeeMain {

    public static void main(String[] args) {





        List<Emplyee> employees = hireEmplyees();

        employees.stream()
                .filter(e -> e.getLevel() > 2)
                .map(g -> g.getDepartment())
                .distinct()
                .sorted(Comparator.comparing(e -> e.getName()))
                .forEach(System.out::println);

        System.out.println("Average age: " +
                employees.stream()
                .mapToInt(Emplyee::getAge)
                .summaryStatistics()
        );

    }

    private static List<Emplyee> hireEmplyees() {
        Department financialDepartment = new Department("Financial department");
        Department backendDepartment = new Department("Backend department");

        return Arrays.asList(new Emplyee(19, "Vasiliy", "java",1, financialDepartment),
                new Emplyee(20, "Petr", ".NET", 3, financialDepartment),
                new Emplyee(38, "Johan", "Delphi", 5, backendDepartment),
                new Emplyee(45, "Sergey", "Java", 2, backendDepartment));
    }
}
