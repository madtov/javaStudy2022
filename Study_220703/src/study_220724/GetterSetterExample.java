package study_220724;

public class GetterSetterExample {
    public static void main(String[] args) {
        GetterSetter myCar = new GetterSetter();

        //잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도 : " + myCar.getSpeed());

        //올바른 속도 변경
        myCar.setSpeed(60);

        //멈춤
        if (myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}
