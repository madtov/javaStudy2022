package study_220904.nestedpublic;

public class A {
    //인스턴스 필드
    B field1 = new B();              //(o)
    C field2 = new C();              //(o)

    //인스턴스 메소드
    void method1() {
        B var1 = new B();            //(o)
        C var2 = new C();            //(o)
    }

    //정적 필드 초기화
    //static B field3 = new B();    //(x)
    static C field4 = new C();      //(o)

    //정적 메소드
    static void method2() {
    //B Var1 = new B();             //(x)
    C var2 = new C();               //(o)
    }

    //인스턴스 멤버 클래스
    class B{}

    //정적 멤버 클래스
    static class C {}
}
