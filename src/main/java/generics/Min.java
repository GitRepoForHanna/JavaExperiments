package generics;

public class Min{
    public static <T extends Comparable<T>> T minimum(T x, T y, T z, T v) {
        T min = x;
        if(y.compareTo(min) < 0){
            min = y;
        }
        if(z.compareTo(min) < 0) {
            min = z;
        }
        if(v.compareTo(min) < 0) {
            min = v;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.printf("The minimum value from set: %d %d %d %d is: %d \n", 4,7,5,2, minimum(4,7,5,2));
        System.out.printf("The minimum value from set: %s %s %s %s is: %s \n", "green","pink","blue","yellow", minimum("green","pink","blue","yellow"));
    }
}
