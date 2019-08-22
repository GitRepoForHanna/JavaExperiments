package beans;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemonstrationMain2 {

    public static void main(String[] args) {
        List<Employee> employees = EmploeeMain.hireEmplyees();
        Map<String, Department> result = employees.stream()
                .filter(emplyee -> emplyee.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toMap(Employee::getName, Employee::getDepartment));

        System.out.println(result);

        String delimitedNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining("#"));

        System.out.println(delimitedNames);

        System.out.println(employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.maxBy(Comparator.comparing(Department::getName))));

        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSkill, Collectors.joining("&")))));



    }
}
