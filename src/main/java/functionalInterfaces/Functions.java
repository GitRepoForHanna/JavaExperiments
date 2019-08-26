package functionalInterfaces;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Functions {

    public static void main(String[] args) {
        UnaryOperator<Integer> addThree = a -> a + 3;
        System.out.println("UnaryOperator: " + addThree.apply(3));

        BinaryOperator<Integer> binaryOperator = (a1, a2) -> (a1 + a2);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        System.out.println("Binary Operator: " + binaryOperator.apply(10,20));
        System.out.println("Binary Operator with map: " + binaryOperatorFun(binaryOperator, map));

        Function<Integer, String> intToString = a -> (String.format("New string item %s", a));
        System.out.println("Function intToString result: " + intToString.apply(11));

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        intList.stream()
                .forEach(a -> {
                    String s = intToString.apply(a);
                    System.out.println(s);
                });

        Collections.sort(intList, (p1,p2) -> p1.compareTo(p2));
    }

    public static List<Integer> binaryOperatorFun(BinaryOperator<Integer> operator, Map<Integer, Integer>map) {
        List<Integer> list = new ArrayList<>();
        map.forEach((m1,m2) -> list.add(operator.apply(m1,m2)));
        return list;
    }


}

