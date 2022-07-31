package day1;

public class Study32 {
    public static void main(String[] args) {
        // 4x+5y=60에 들어갈 모든 해를 구하시오. (단, x와 y는 10이하 자연수)
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if (60 - 5*y - 4*x == 0) {
                    System.out.println("(x:" + x + ",y:" + y + ")");
                }
            }
        }
    }
}