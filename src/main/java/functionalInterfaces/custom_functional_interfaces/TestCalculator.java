package functionalInterfaces.custom_functional_interfaces;

public class TestCalculator {

    public static void main(String[] args) {
        Calculate summarize = (a, b) -> a + b;
        System.out.println(summarize.calc(5, 7));
    }
}
