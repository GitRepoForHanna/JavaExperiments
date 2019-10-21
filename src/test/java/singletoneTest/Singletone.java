package singletoneTest;

public class Singletone {

    private static Singletone instance;

    private Singletone() {
    }

    private static ThreadLocal<Singletone> threadLocal = new ThreadLocal<Singletone>(){
        @Override
        protected Singletone initialValue() {
            if(null == instance) {
                instance = new Singletone();
            }
            return instance;
        }
    };

    public static Singletone getSingletoneInstance() {
        return threadLocal.get();
    }
}
