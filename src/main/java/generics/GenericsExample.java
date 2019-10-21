package generics;

import java.util.Arrays;
import java.util.List;

public class GenericsExample<T> {

    public static Number sum(List<? extends Number> list) {
        Double res =  list.stream()
                    .mapToDouble(w -> ((Number) w).doubleValue())
                    .sum();
        return res;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,5,8,23,67);
        List<Double> doubleList = Arrays.asList(4.66, 7.12, 5.17, 77.77);
        List<String> strList = Arrays.asList("a", "ab", "cc");

        System.out.println("Int List Summ - " + sum(intList));
        System.out.println("Double List Summ - " + sum(doubleList));
//        System.out.println("String List Summ - " + sum(strList));  compile error
    }


}
