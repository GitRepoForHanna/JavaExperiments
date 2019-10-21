package generics;

public class MaximumTest {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }

        if(z.compareTo(max) > 0){
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("The max value from %.2f %.2f %.2f is: %.2f\n\n", 7.77, 12.86, 14.00, maximum(7.77, 12.86, 14.00));
        System.out.printf("The max value from %d %d %d is: %d\n\n", 7, 12, 27, maximum(7, 12, 27));
        System.out.printf("The max value from %s %s %s is: %s\n\n", "orange", "red", "green", maximum("orange", "red", "green"));
    }
}
