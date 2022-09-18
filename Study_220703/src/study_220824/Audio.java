package study_220824;

public class Audio implements RemoteControl{
    //필드
    private int volume;
    private boolean mute;

    //turnOn() 추상메소드와 실체메소드
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    //turnOff() 추상메소드와 실체메소드
    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    //setVolume() 추상메소드와 실체메소드
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio볼륨 : " + this.volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute) {
            System.out.println("Audio 무음 처리합니다.");
        } else {
            System.out.println("Audio 무음 해제합니다.");
        }
    }
}
