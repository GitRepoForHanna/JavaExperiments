package beans;

import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class EmplyeeMainPart4 {

    public static void main(String[] args) {
        CalculateOerDiem machine = new CalculateOerDiem();
        Function<Integer, Double> curriedByFirstArgument = machine.curryFirstArgument(57.16);
        System.out.println(curriedByFirstArgument.apply(5));
        System.out.println(curriedByFirstArgument.apply(10));

        Function<Double, Double> curriedBySecondParameter = machine.currySecondArgument(10);
        System.out.println(curriedBySecondParameter.apply(56.12));
        System.out.println(curriedBySecondParameter.apply(30.12));
    }
}

@FunctionalInterface
interface CurriedBiFunction <T, U, R> extends BiFunction<T, U, R>{
    default Function<U, R> curryFirstArgument(T t) {
        return u -> apply(t, u);
    }

    default Function<T, R> currySecondArgument(U u) {
        return t -> apply(t, u);
    }
}

class CalculateOerDiem implements CurriedBiFunction <Double, Integer, Double>{
    private static Double perDiemRate = 10.15;

    @Override
    public Double apply(Double dollarExchengeRate, Integer daysAmount) {
        return dollarExchengeRate * daysAmount;
    }
}