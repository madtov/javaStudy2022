package study_220703;

public class Study28 {
    public static void main(String[] args) {
        Dog:for(char upper='A'; upper<='Z';upper++)  {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" +lower);
                if (lower=='g') {
                    break Dog;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
