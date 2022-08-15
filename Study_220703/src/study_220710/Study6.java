package study_220710;

public class Study6  {
    public static void main(String[] args) {

        int [][] mathScores = new int [2][3];
        for (int i = 0; i <mathScores.length; i++) {
            System.out.println("i length = " + mathScores.length);
            for (int k = 0; k < mathScores.length; k++) {
                System.out.println("k length = " + mathScores[0].length);
                System.out.println("mathScores[" +i+ "][" +k+ "]="
                        +mathScores [i][k]);
            }
        }
        System.out.println();

        int[][] mintpot = new int [2][];
        mintpot[0] = new int[2];
        mintpot[1] = new int[3];
        for (int jerry = 0; jerry < mintpot.length; jerry++) {
            for (int ken = 0; ken < mintpot[jerry].length; ken++) {
                System.out.println("mintpot[" +jerry+ "][" +ken+ "]=" + mintpot[jerry][ken]);
            }
        }
        System.out.println();

        int[][] javaScores = { {95,80}, {92,96,80} };
        for (int i = 0; i < javaScores.length; i++) {
            for (int k = 0; k < javaScores[i].length; k++) {
                System.out.println("javaScores[" +i+ "][" +k+ "]="
                 +javaScores[i][k]);
            }
        }
    }
}
