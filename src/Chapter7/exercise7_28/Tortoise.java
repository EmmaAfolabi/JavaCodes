package Chapter7.exercise7_28;

public class Tortoise {

    private final int fastPlod = 3;
    private final int Slip = -6;
    private final int slowPod = 1;


    public int move(int range) {

        if (range <= 1 && range <= 5) {
            return fastPlod;
        }
        else if (range >= 6 && range <= 7) {
            return Slip;
        }
        else {
            return slowPod;
        }
    }
}
