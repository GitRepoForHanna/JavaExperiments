package generics;

public class TestIAddable implements IAddable<String, Integer> {
    @Override
    public String doSomeOperation(Integer a) {
        return a.toString();
    }

    @Override
    public Integer reverseOperation(String s) {
        return Integer.parseInt(s);
    }
}

class Test2IAddable implements IAddable<Double, Integer> {
    @Override
    public Double doSomeOperation(Integer a) {
        return Double.valueOf(a);
    }

    @Override
    public Integer reverseOperation(Double b) {
        return b.intValue();
    }
}