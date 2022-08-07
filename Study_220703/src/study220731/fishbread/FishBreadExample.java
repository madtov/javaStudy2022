package study220731.fishbread;

public class FishBreadExample {
    public static void main(String[] args) {
        //FishBread 선언
        FishBread fishBread = new FishBread();

        //10번의 붕어빵 만들기 시작
        for (int i = 0; i <= 10; i++) {
            int problemSell = fishBread.sell();

            switch (problemSell) {
                // 1번 붕어빵 잼이 떨어지면 빨기잼으로
                case 1 :
                    System.out.println("1번 붕어빵 빨기잼으로 변경" );
                    fishBread.firstBread = new StrawberryJam("빨기잼", 15);
                    break;
                case 2 :
                    System.out.println("2번 붕어빵 포도으로 변경" );
                    fishBread.secondBread = new GrapeJam("포도잼", 12);
                    break;
                case 3 :
                    System.out.println("3번 붕어빵 빨기잼으로 변경" );
                    fishBread.thirdBread = new StrawberryJam("빨기잼", 13);
                    break;
                case 4 :
                    System.out.println("4번 붕어빵 포도잼으로 변경" );
                    fishBread.fourthBread = new GrapeJam("포도잼", 17);
                    break;
            }
        }
    }
}
