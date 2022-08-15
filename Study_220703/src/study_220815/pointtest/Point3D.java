package study_220815.pointtest;

public class Point3D extends Point {
    int z;

    Point3D(){
        this(100, 200, 300);
    }
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

//    String getLocation() {  // 오버라이딩
//        return "x : " + x + "y : " + y + ", z : " + z;
//    }
}
