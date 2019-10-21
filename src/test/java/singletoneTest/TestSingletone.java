package singletoneTest;

import java.util.Random;

public class TestSingletone extends Thread {

    @Override
    public void run() {
        Singletone instance1 = Singletone.getSingletoneInstance();
        System.out.println(getThreadName() + instance1);
        sleep(100, 50);
        Singletone instance2 = Singletone.getSingletoneInstance();
        System.out.println(getThreadName() + instance2);
        boolean equal = instance1 == instance2;
        String message = equal ? "Both are equal" : "Not equal";
        System.out.println(message);
    }

    public void sleep(int max, int min) {
        int time = new Random().nextInt(max - min + 1);
        try {
            this.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getThreadName() {
        return "[" + currentThread().getName() + "] - ";
    }

    public static void main(String[] args) {
        TestSingletone test1 = new TestSingletone();
        test1.start();

        TestSingletone test2 = new TestSingletone();
        test2.start();

        TestSingletone test3 = new TestSingletone();
        test3.start();
    }
}
