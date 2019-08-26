package functionalInterfaces;

import beans.Department;
import beans.Employee;

import java.util.*;
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


        Employee e1 = new Employee(32, "Tom", "Java", 3, new Department("Web development"));
        Employee e2 = new Employee(30, "Andy", "Java", 5, new Department("Web development"));
        Employee e3 = new Employee(31, "Tim", "Java", 1, new Department("Web development"));
        Employee e4 = new Employee(33, "Dan", "Java", 2, new Department("Web development"));

        //Comparator
        Comparator <Employee> compareJavaLevels = Comparator.comparingInt(e -> e.getLevel());


                Arrays.asList(e1,e2,e3, e4).stream()
                        .collect(Collectors.toMap(Employee::getName, Employee::getLevel))
                        .entrySet()
                        .stream()
                        .sorted(Comparator.comparing(e -> e.getValue()))
                        .collect(Collectors.toList())
                        .forEach(System.out::println);


                Arrays.asList(e1,e2,e3, e4).stream()
                .collect(Collectors.toList())
                .stream()
                .sorted(Comparator.comparing(Employee::getLevel))
                 .forEach(e -> {
                     System.out.println(e.getName() + " - " + e.getLevel());
                 });

        System.out.println(Arrays.asList(e1,e2,e3,e4).stream()
                .collect(Collectors.groupingBy(Employee::getLevel, Collectors.toMap(Employee::getName, Employee::getAge))));

        System.out.println(Arrays.asList(e1,e2,e3,e4).stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.toMap(Employee::getSkill, Employee::getLevel))));

        System.out.println(Arrays.asList(e1,e2,e3,e4).stream()
                .collect(Collectors.partitioningBy(e -> e.getLevel() > 2, Collectors.toMap(Employee::getName, Employee::getLevel))));

        List<String> stringList = Arrays.asList("a1", "a2", "abc", "b2ds", "bc");
        Map<String,Integer> map = stringList.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(map);

        Map<String,Integer> result = stringList.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, (item, identicalItem) -> identicalItem));

        System.out.println(result);

        System.out.println(stringList.stream()
                .collect(Collectors.joining()));

        System.out.println(stringList.stream()
                .collect(Collectors.joining(", ", "Begin: ", " End")));

        System.out.println(stringList.stream()
                .collect(Collectors.counting()));

        System.out.println(stringList.stream()
                .collect(Collectors.summarizingInt(String::length)));

        System.out.println(stringList.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet())));

    }
}
