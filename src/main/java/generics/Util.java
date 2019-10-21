package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Util {
    public static <T> T getValue(Object obj, Class<T> klass) {
        return (T)obj;
    }

    public static <T> T getValue(Object obj) {
        return (T)obj;
    }

    public static void main(String[] args) {
        List list = Arrays.asList("Aithor", "Hello!");
        list.stream()
                .forEach(a -> {
                    String data = getValue(a, String.class);
                    System.out.println(data);
                    System.out.println(Util.<String>getValue(a));
                });

        SomeType<String> type = new SomeType<>();
        List<Integer> listInt = Arrays.asList(1,2,3,4,5);
        List<String> strList = Arrays.asList("Hello", "World");
        type.test(listInt);
        type.test(strList);
    }
}

class SomeType<T> {
    public <T> void test(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element);
        }
    }
//    public void test(List<Integer> collection) {
//        for (Integer element : collection) {
//            System.out.println(element);
//        }
//    }
}
