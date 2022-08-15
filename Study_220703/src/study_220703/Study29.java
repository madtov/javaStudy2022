package study_220703;

public class Study29 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if(i%2 !=0) {
            continue;
            }
            System.out.println(i);
        }

        int num = 1;
        //boolean yyy = true;
        while (true) {
            num++;
            if (num%2 != 0) {
                continue;
            }
            System.out.println(num);
            if (num >= 10) {
                break;
            }
        }
    }
}
