package study220731.fishbread;

public class Jam {
    public int nowJam;          // 보유한 잼 수량
    public int usedJam;          // 사용한 잼 수량
    public String jamType;      // 잼 종류

    public Jam(String jamType, int nowJam) {
        //초기화 해주세요
        this.jamType = jamType;
        this.nowJam = nowJam;
    }

    public boolean bake() {
        ++usedJam;      //현재 잼 사용 수
        if(usedJam < nowJam) {
            System.out.println(jamType + "남은 jam 수량: " +
                    (nowJam - usedJam) + "개");
            return true;
        } else {
            System.out.println("*** " + jamType + "매진 ***");
            return false;
        }
    }
}
