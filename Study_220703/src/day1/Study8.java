package day1;

public class Study8 {
    public static void main(String[] args) {
        int x1 = 10;
        int y1= 5;

        System.out.println((x1>7) && (y1<=5));
        System.out.println((x1%3 == 2) || (y1%2 != 1));

        double x = 5.0;
        double y = 2.0;

        double z = x % y;
        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z +10 ;
            System.out.println(" 결과: " + result);
        }
    }
}
