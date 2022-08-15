package study_220724;

public class OverRideExample {
    public static void main(String[] args) {
        int r = 10;

        OverRide calculator = new OverRide();
        System.out.println("원면적 : " + calculator.areaCircle(r));
        System.out.println();

        OverRideSon computer = new OverRideSon();
        System.out.println("원면적 : " + computer.areaCircle(r));
    }
}
