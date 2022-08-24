package assignment2;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = new Tire();

        snowTire.run();
        tire.run();
    }
}

//오버라이딩으로 타이어를 스노우타이어로 재정의한 것
