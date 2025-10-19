package Chapter8;
// Time1 class declaration maintains the time in 24-hour format.

public class Time1 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // set a new time value using universal time; throw an
    // exception if the hour, minute or second is invalid
    public void setTime(int hour, int minute, int second) {
        // validate hour, minute and second
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
        second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                    "hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}