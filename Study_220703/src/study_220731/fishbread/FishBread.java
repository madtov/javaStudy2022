package study_220731.fishbread;

public class FishBread {
    //필드
    //1번 붕어빵 필드
    Jam firstBread = new Jam("팥", 5);
    //2번 붕어빵 필드
    Jam secondBread = new Jam("슈크림", 6);
    //3번 붕어빵 필드
    Jam thirdBread = new Jam("고구마", 4);
    //4번 붕어빵 필드
    Jam fourthBread = new Jam("감자",3);

    //생성자
    //메소드
    int sell() {
        System.out.println("[붕어빵을 만듭니다.]");
        //1번 붕어빵 짠다
        if(firstBread.bake()==false) {end(); return 1;}
        //2번 붕어빵 짠다
        if(secondBread.bake()==false) {end(); return 2;}
        //3번 붕어빵 짠다
        if(thirdBread.bake()==false) {end(); return 3;}
        //4번 붕어빵 짠다
        if(fourthBread.bake()==false) {end();return 4;}
        return 0;
    }

    void end() {
        System.out.println("[붕어빵의 jam이 없습니다.]");
    }
}
