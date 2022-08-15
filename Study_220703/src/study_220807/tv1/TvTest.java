package study_220807.tv1;

public class TvTest {
    public static void main(String[] args) {
        Tv t;               // TV인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();       // TV인스턴스를 생성한다.
        t.channel = 7;      // TV인스턴스의 멤버변수 channel1의 값을 7로 한다.
        t.channel1Down();   // TV인스턴스의 메서드 channel1Down()을 호출한다.
        System.out.println("현재 채널은" + t.channel + "입니다.");
    }
}
