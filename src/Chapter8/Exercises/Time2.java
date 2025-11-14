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

        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0 - 23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0 - 59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0 - 59");

        timeInSeconds = ((hour * 3600) + (minute * 60) + second);
    }


}
