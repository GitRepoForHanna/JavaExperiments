package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemonstratingMain {
    public static void main(String[] args) {
        Map<String, Integer> backendSkillMatrix = new HashMap<>();
        backendSkillMatrix.put("Java", 4);
        backendSkillMatrix.put("Skala", 3);
        backendSkillMatrix.put("Kotlin", 1);
        Developer backender = new Developer("Petya", backendSkillMatrix);

        Map<String, Integer> frontendSkillMatrix = new HashMap<>();
        frontendSkillMatrix.put("React", 80);
        frontendSkillMatrix.put("Angular", 88);
        frontendSkillMatrix.put("Kotlin", 4);
        Developer frontender = new Developer("Vasya", frontendSkillMatrix);

        List<Developer> projectTeam = new ArrayList<>();
        projectTeam.add(backender);
        projectTeam.add(frontender);

        List<String> result = projectTeam.stream()
                .map(d -> d.getSkillMatrix().entrySet())
                .flatMap(set -> set.stream())
                .peek(System.out::println)
                .filter(item -> item.getValue() > 3)
                .map(item -> item.getKey())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);

        Stream<Integer> ints = Stream.of(1,2,3,4,5,6,7);
        System.out.println(ints.mapToInt(a -> a).sum());
        System.out.println(ints.reduce(Integer::sum));
        System.out.println(ints.collect(Collectors.summingInt(Integer::intValue)));


    }
}
