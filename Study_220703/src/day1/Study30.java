package day1;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Study30 {
    public static void main(String[] args) {
        //1부터 100까지 중에 3의배수의 총합
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) {
                sum += i;
                while (i == 100) {
                    break;
                }
            }
        }
    System.out.println("1부터 100까지 중에 3의 배수의 총합 = " + sum);
    }
}