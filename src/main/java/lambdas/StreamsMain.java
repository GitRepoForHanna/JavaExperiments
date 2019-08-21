package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMain {
    public static void main(String[] args) {

//        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6)
//                .stream()
//                .filter(e -> e > 4)
//                .map(bb -> 1);
//
//        System.out.println(stream.count());
//
//        stream.forEach(System.out::println);

//        IntStream.iterate(0, i -> i+2)
//                .limit(15)
//                .forEach(e -> {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException ex) {
//                        ex.printStackTrace();
//                    }
//                    System.out.println(e);
//                });
//
//        System.out.println("After stream");

        Arrays.asList(new Double(2), new Double(3), new Double(6.),new Double(7.98), new Double(-3), new Double(15l))
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
}
