package study_220815.pointtest;

public class Point {
    int x;
    int y;

    Point (int x, int y) {
//        super();
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y :" + y;
    }
}
