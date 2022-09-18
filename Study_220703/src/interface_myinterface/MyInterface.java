package interface_myinterface;

public interface MyInterface {
    public void method1();

//    void method2();
    default void method2() {
        System.out.println("MyInterface-method2 실행");
    }
}
