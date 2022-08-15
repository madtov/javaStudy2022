package study_220815.singleton;

public class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        // ...
    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
    // ...
}
