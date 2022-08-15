package study_220731.tv;

public class TVExample {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();

        IPTV iptv = new IPTV(32,2048,"192.1.1.2"); //"192.1.1.2"주소에 32인치, 2048컬러
        iptv.printProperty();
    }
}

//실행결과 : 32인치 1024컬러