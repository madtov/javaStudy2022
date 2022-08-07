package study220807.methodExample;

public class Method1 {
    void count (int[]array) {
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] % 5 != 0) {
                num++;
            }
        }

        int add = 0;
        for (int x = 0; x < array.length; x++) {
            if (array[x] % 2 != 0 && array[x] % 5 != 0) {
                add += array[x];
            }
        }

        System.out.println("add = " + add);
        System.out.println("num = " + num);
        }
    }
