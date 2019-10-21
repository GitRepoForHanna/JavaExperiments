package generics;

public class Box <T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T getT() {
        return this.t;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        Box<Double> doubleBox = new Box<Double>();
        Box<String> stringBox = new Box<String>();

        intBox.add(13);
        doubleBox.add(25.5);
        stringBox.add("Hanna");
        stringBox.add("Helen");

        System.out.printf("Integer value: %d\n", intBox.getT());
        System.out.printf("Double value: %.2f\n", doubleBox.getT());
        System.out.printf("String value: %s\n", stringBox.getT());
    }
}
