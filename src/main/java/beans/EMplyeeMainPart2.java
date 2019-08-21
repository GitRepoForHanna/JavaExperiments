package beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

public class EMplyeeMainPart2 {

    public static void main(String[] args) {
        Predicate<Integer> isPrime = number -> isEven(number);

        Supplier<Boolean> random = () -> ThreadLocalRandom.current().nextBoolean();

        Consumer<Integer> messageVerification = message -> System.out.println(message);

        Function<String, Department> strangeConstructor = name -> new Department(name);

        Function<Integer, Integer> addTwo = a -> a + 2;

//        System.out.println(addTwo.apply(2));

//        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map(addTwo).filter(isPrime)
//                .forEach(messageVerification);

        Function<String,Department> departmentConstructor = Department::new;
        Arrays.asList("Backend ", "Frontend").stream().map(departmentConstructor)
                .forEach(System.out::println);

        BiFunction<String, CharSequence, Boolean> contains = String::contains;
        System.out.println(contains.apply("Russia", "Alaska"));

        final DoubleUnaryOperator doubleUnary = Math::abs;
        System.out.println(doubleUnary.applyAsDouble(-3.33));

        Function<Department, String> getName = Department::getName;
        System.out.println(getName.apply(departmentConstructor.apply("Mobile")));

    }


    private static boolean isEven(Integer number) {
        if(number % 2 == 0)
            return true;
        else
            return false;
    }
}
