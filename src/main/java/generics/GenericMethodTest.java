package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodTest {

    public static <E> void printArray(E[] array) {
        Arrays.asList(array).stream()
                .map(e -> e.toString().toLowerCase())
                .sorted()
                .forEach(e -> System.out.print(e + " "));
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,2,3,4,5,6,7,8};
        Double[] doubleArray = new Double[]{1.0, 2.2, 3.540, 4.856, 5.120, 6.66, 7.554, 8.234};
        Character[] charArray = new Character[]{'a', 'n', 't', 'Y', 'Q', 'R', 'n'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
