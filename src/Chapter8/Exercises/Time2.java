package Chapter8.Exercises;

public class Time2 {

    private int timeInSeconds;

    public Time2() {

        this(0, 0, 0); // invoke constructor with three variable and initialize values
    }

    public Time2(int hour) {

        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {

    }
}
