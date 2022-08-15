package study_220815.singleton;

public class SingletonTest {
    public static void main(String[] args) {
//  Singleton s = new Singleton();  // getInstance 통해서만 접근 가능.
    Singleton s = Singleton.getInstance();
    }
}