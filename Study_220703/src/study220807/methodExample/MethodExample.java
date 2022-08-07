package study220807.methodExample;

public class MethodExample {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
        Method mt = new Method();
        int cnt = mt.count(data);
        System.out.println("cnt = " + cnt);
        System.out.println("max = " + mt.sum(data));
    }
}
