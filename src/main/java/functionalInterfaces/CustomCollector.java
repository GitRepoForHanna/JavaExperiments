package functionalInterfaces;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CustomCollector implements Collector<Double, Map<Integer,Integer>, Map<Integer,Integer>> {

    @Override
    public Supplier<Map<Integer, Integer>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<Integer, Integer>, Double> accumulator() {
        return (map, val) -> map.merge((int)(val/2), 1 , (a,b) -> a + b);
    }

    @Override
    public BinaryOperator<Map<Integer, Integer>> combiner() {
        return (map1, map2) -> {
            map2.forEach((k, v) -> map1.merge(k,v,(v1, v2) -> v1+ v2));
            return map1;
        };
    }

    @Override
    public Function<Map<Integer, Integer>, Map<Integer, Integer>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }

    public static CustomCollector tryYourCollector(int bucketSize) {
        return new CustomCollector();
    }

    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 1.1, 1.4, 1.7, 1.4, 5.4, 9.9);
        Map<Integer, Integer> histogram = numbers.stream().collect(tryYourCollector(1));

        System.out.println(histogram);
    }
}
