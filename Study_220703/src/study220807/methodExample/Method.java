package study220807.methodExample;

public class Method {
    int count (int[] arr) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    int sum (int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                max += arr[i];
            }
        }
        return max;
    }

}
