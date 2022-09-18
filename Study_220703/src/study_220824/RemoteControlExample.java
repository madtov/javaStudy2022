package study_220824;

public class RemoteControlExample {
    public static void main(String[] args) {
//        RemoteControl rc;
//        rc = new Television();
//        rc = new Audio();

//        RemoteControl rc = new RemoteControl() {
//            @Override
//            public void turnOn() {
//                System.out.println("전원켠다");
//            }
//
//            @Override
//            public void turnOff() {
//                System.out.println("전원끈다");
//            }
//
//            @Override
//            public void setVolume(int volume) {
//                System.out.println("볼륨설정한다");
//            }
//        };
//        RemoteControl rc = null;
//
//        rc = new Television();
//        rc.turnOn();
//        rc.turnOff();
//        rc.setMute(true);
//
//        rc = new Audio();
//        rc.turnOn();
//        rc.turnOff();
//        rc.setMute(true);
        //정적 메소드 사용
        RemoteControl.changeBattery();
    }
}
