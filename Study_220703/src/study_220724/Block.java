package study_220724;

public class Block {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        Block myCar = new Block();
        myCar.speed = 60;
        myCar.run();
    }
}
