package study_220815.tvcr;

public class Tvcr extends Tv {
    Vcr vcr = new Vcr();
    int counter = vcr.counter;

    void play () {
        vcr.play();
    }

    void stop () {
        vcr.stop();
    }

    void rew () {
        vcr.rew();
    }

    void ff () {
        vcr.ff();
    }
}