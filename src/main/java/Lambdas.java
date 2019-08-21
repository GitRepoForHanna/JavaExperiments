import org.apache.commons.io.FileUtils;

public class Lambdas {

    public static void main(String[] args) {
        Operationable<Integer> operationable1 = (a, b) -> a + b;
        Operationable<String> operationable2 = (a, b) ->  a + b;
        System.out.println(operationable1.calculate(17, 11));
        System.out.println(operationable2.calculate("I am ", "so happy!"));

    }

}
