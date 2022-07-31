package day4;

public class G {
    //필드
    public int field1;
    int field2;
    private int field3;

    //생성자
    public G() {
        field1 = 1; //(o)
        field2 = 1; //(o)
        field3 = 1; //(o)

        method1();  //(o)
        method2();  //(o)
        method3();  //(o)
    }

    //메소드
    public void method1() {}
    void method2() {}
    private void method3() {}
}
