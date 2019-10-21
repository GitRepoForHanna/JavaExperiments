package functionalInterfaces;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class CallableExample {
    public static String werrt() {
        return "werrt calling";
    }

    public static String werrt2() {
        return "rtyr calling";
    }

    public static void main(String[] args) {
        asdf(() -> werrt());
        asdf(() -> werrt2());
        ExecutorService executor = Executors.newFixedThreadPool(10);
    }

    public static void asdf(Callable action) {
        try {
            System.out.println(action.call());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

//    public Function<Integer, String> blue(Integer a) {
//        return Integer.toString()
//    }

    public static String  function1(Function<Integer, String> func) {
        int a = 14;
        return func.apply(a);
    }
}
