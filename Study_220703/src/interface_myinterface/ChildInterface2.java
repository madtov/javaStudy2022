package interface_myinterface;

public interface ChildInterface2 extends ParentInterface{
    @Override
    default void method2() {
        //
    }

    public void method3();
}
