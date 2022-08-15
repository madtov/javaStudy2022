package study_220703;

public class Study31 {
    public static void main(String[] args) {
        while (true) {
        int dice1 = (int) (Math.random() * 6) +1;
        int dice2 = (int) (Math.random() * 6) +1;
        System.out.println("(눈" + dice1 + ", 눈" + dice2 + ")");
            if (dice1 + dice2 == 5) {
                break;
            }
        }
    }
}