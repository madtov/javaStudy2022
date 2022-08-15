package study_220724;

public class D {
    //필드
    D d1 = new D(true);     // o
    D d2 = new D(1);        // o
    D d3 = new D("문자열");   // o

    //생성자
    public D(boolean D) {}
    D(int D) {}
    private D(String D) {}
}
