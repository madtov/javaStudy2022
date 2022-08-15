package study_220815;

class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;   //조상 클래스로부터 상속받은 멤버
        ctv.channelup();    //조상 클래스로부터 상속받은 멤버
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World"); //캡션기능을 켠다.
        ctv.caption = true;
        ctv.displayCaption("Hello, World"); //캡션을 화면에 보여준다.
    }
}