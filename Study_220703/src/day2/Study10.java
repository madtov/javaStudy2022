package day2;

public class Study10 {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for (int score = 0; score < scores.length; score++) {
            System.out.println(scores[score]);
        }
        for (int dog : scores) {
            System.out.println(dog);
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);

    }
}
