package beans;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EmplyeePart3 {

    public static void main(String[] args) {
        List<Integer> fibonachiNumbers = Arrays.asList(1,1,2,3,5,8,13);

        Function<Integer, Integer> addTwo = number -> number + 2;
        Function<Integer,Integer> multiple10 = number -> number * 10;


        fibonachiNumbers.stream().map(addTwo.andThen(multiple10))
                .forEach(System.out::println);

        fibonachiNumbers.stream().map(addTwo.compose(multiple10))
                .forEach(System.out::println);

        fibonachiNumbers.stream().map(compose(addTwo, multiple10))
                .forEach(System.out::println);
    }

    private static Function<Integer, Integer> compose(Function<Integer, Integer> x, Function<Integer, Integer> y) {
        return result -> y.apply(x.apply(result));
    }


}
