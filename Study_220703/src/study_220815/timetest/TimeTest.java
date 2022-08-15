package study_220815.timetest;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time (12, 35, 30);
        System.out.println(t);
//      t.hour = 13;                    //private이라서 불러올 수 없음!
        t.setHour (t.getHour() +1);     // 현재시간보다 1시간 후로 변경한다.
        System.out.println(t);          // System.out.Println(t.toString());과 같다.
    }
}
