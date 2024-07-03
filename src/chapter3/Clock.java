package chapter3;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour > 23) {
            setHour(0);
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (minute > 59){
            setMinute(0);
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        if (second > 59){
            setSecond(0);
        }
    }

    public Clock(int hour, int minute, int second) {
        this.minute = minute;
        this.second = second;
        this.hour = hour;
    }
}
