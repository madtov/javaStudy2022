package study_220731.tv;

public class IPTV extends ColorTV {
    public String iptv;
    public IPTV (int size, int color, String iptv) {
        super(size, color);
        this.iptv = iptv;
    }

    @Override
    public void printProperty() {
        System.out.println("나의 iptv는" + iptv + "주소의" + getSize() +"인치, " + color + "컬러");
    }
}
