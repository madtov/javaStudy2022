package study_220815.FinalCardTest;

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card ("HEART", 10);
//      c.NUMBER = 5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);  //System.out.printin (c.toString());
    }
}
