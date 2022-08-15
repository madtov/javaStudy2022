package study_220710;

public class Study9 {
    public static void main(String[] args) {
        String[] oldstrArray = {"java", "array", "copy"};
        String[] newstrArray = new String[5];

        System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length);

        for (int i = 0; i < newstrArray.length; i++) {
            System.out.println(newstrArray[i] + ", ");
        }
    }
}
