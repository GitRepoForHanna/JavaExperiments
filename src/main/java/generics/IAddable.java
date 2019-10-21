package generics;

public interface IAddable<T1, T2>{
    T1 doSomeOperation(T2 t);
    T2 reverseOperation(T1 t);
}
