package study_220710;

public class carsomeexample {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자
    carsomeexample() {

    }

    carsomeexample(String model) {
        this.model = model;
    }

    carsomeexample(String model, String color) {
        this.model = model;
        this.color = color;
    }

        carsomeexample(String model, String color, int maxSpeed) {
            this.model = model;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
}