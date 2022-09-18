package study_220918;

import java.sql.Array;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//
//        int date1 = arr[0];
//        int date2 = arr[1];
//        int date3 = arr[2];
//        int date4 = arr[3];
//
//        System.out.println("args[0]: " + date1);
//        System.out.println("args[1]: " + date2);
//        System.out.println("args[2]: " + date3);
//        System.out.println("args[3]: " + date4);

        if(args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];
            System.out.println("args[0]:" + data1);
            System.out.println("args[1]:" + data2);
        } else {
            System.out.println("[실행방법]");
            System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
            System.out.println("값1 값2");
        }
    }
}