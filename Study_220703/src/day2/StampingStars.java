package day2;

public class StampingStars {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int x = 1; x <= 4; x++) {
                if (x > i) {
                    System.out.print(" ");
                }
            }
            for (int y = 1; y <= (i*2+1); y++) {
                if (y >= 1) {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
