package day1;

public class Study33 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            if (i == 1) {
//                System.out.println("*");
//            }
//            if (i == 2) {
//                System.out.println("**");
//            }
//            if (i == 3) {
//                System.out.println("***");
//            }
//            if (i == 4) {
//                System.out.println("****");
//            }
//            if (i == 5) {
//                System.out.println("*****");
//            }
//        }
//        for (int i = 0; i <= 3; i++) {
//            for (int x = 3; x >= i; x--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= 4; j++) {
//                for (int y = 0; y <= j; y++) {
//                    System.out.print("*");
//                }
//            }
//        System.out.println();
//        }
        System.out.println(" ============== ");
        for (int i = 0; i <=4; i++) {
            for (int x = 3; x >= i; x--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ============== ");
    }
}