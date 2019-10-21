package generics;

import java.util.Arrays;
import java.util.List;

public class Occurances {

    public static <T> int countAllOccurances(List<T> list, T item) {
        int count = 0;
        if(item == null) {
            for (T t: list) {
                if(t.equals(null))
                    count++;
            }
        }
        else {
            for (T t : list) {
                if(t.equals(item)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2,6,1,8,0,3,16);
        List<String> stringList = Arrays.asList("ab", "cc", "abc", "a", "abc", "aa", "ac");
        System.out.print("Occurances in int list: " + countAllOccurances(intList, 2) + "\n");
        System.out.print("Occurances in String list: " + countAllOccurances(stringList, "ac"));
    }
}
