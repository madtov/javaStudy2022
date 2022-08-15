package assignment;

public class StampStars {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int y = 0; y <= 4; y++) {
                if (y > i) {
                    System.out.print(" ");
                }
            }
            for (int x = 1; x <= (i*2+1); x++) {
                if (x > 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
