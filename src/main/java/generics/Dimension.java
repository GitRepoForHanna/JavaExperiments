package generics;

public class Dimension<T1, T2, T3> {

    private T1 width;
    private T2 length;
    private T3 heigth;

    public Dimension(T1 width, T2 length, T3 heigth) {
        this.width = width;
        this.length = length;
        this.heigth = heigth;
    }
}
