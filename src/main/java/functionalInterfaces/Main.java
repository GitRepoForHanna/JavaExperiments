package functionalInterfaces;

import beans.Department;
import beans.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Predicates are boolean-valued functions of one argument.
        // The interface contains various default methods
        // for composing predicates to complex logical terms (and, or, negate)
        Predicate<String> isEmpty = s -> s.length() > 0;
        Predicate <String> isLongerThan5 = s -> s.length() > 5;
        Predicate <String> isLongWord = isEmpty.and(isLongerThan5);
        System.out.println(isLongWord.test("Minsk"));
        System.out.println(isLongWord.test("Vitebsk"));

        //Functions accept one argument and produce a result
        Function <Integer, Integer> multiple5 = a -> (a * 5);
        Function <Integer, String> convertToString = a -> Integer.toString(a);
        System.out.println(multiple5.andThen(convertToString).apply(5));

        //Suppliers
        Supplier<Employee> getEmployee = Employee::new;
        Employee em1 = getEmployee.get();

        //Consumer
        Consumer <Employee> initializeEmployee = employee -> {
            employee.setAge(30);
            employee.setDepartment(new Department("Development"));
            employee.setName("Alex");
            employee.setSkill("Javascript");
            employee.setLevel(3);
            System.out.println(employee);
        };
        initializeEmployee.accept(em1);

        //Comparator
        Employee e1 = new Employee(32, "Tom", "Java", 3, new Department("Web development"));
        Employee e2 = new Employee(31, "Tim", "Java", 1, new Department("Web development"));
        Employee e3 = new Employee(33, "Dan", "Java", 2, new Department("Web development"));

        Comparator <Employee> compareJavaLevels = Comparator.comparingInt(e -> e.getLevel());


                Arrays.asList(e1,e2,e3).stream()
                        .collect(Collectors.toMap(Employee::getName, Employee::getLevel))
                        .entrySet()
                        .stream()
                        .sorted(Comparator.comparing(e -> e.getValue()))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);


//        Arrays.asList(e1,e2,e3).stream()
//                .collect(Collectors.toMap(Employee::getName, Employee::getLevel))
//                .entrySet()
//                .stream()
//                .sorted(Comparator.comparing(e -> e.getValue()))
//                .collect(Collectors.mapping(e -> e.getKey()))
//                .forEach(System.out::println);

    }
}
