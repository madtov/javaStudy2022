package study220807.tv4;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv [3];        //길이가 3인 TV객체 배열

        // TV 객체를 생성해서 TV 객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;  // tvArr[i]의 channel에 i + 10을 저장
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelup();       // tvArr[i]의 메서드 호출. 채널이 1 증가.
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}
