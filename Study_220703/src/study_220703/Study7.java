package study_220703;

public class Study7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);

        int score = 85;
        String result = (!(score>90)? "가":"나");
        System.out.println(result);

        int pencils = 534;
        int students = 30;

        //학생 한 명이 가지는 연필 수
        int pencilsPerStudent = (pencils / students);
        System.out.println(pencilsPerStudent);

        //남은 연필 수
        int pencilsLeft = (pencils%pencilsPerStudent);
        System.out.println(pencilsLeft);

        int value = 356;
        System.out.println(value-56);

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 = (lengthTop + lengthBottom) * height / 2;
        System.out.println("area1 = " + area1);
        double area2 = (double)(lengthTop + lengthBottom) * height / 2;
        System.out.println("area2 = " + area2);

        int x1 = 10;
        int y1= 5;

    }
}
