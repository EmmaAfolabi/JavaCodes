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
        if (hour > 23){
            hour =0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (minute > 59){
            minute =0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        if (second > 59){
            second =0;
        }
    }

    public Clock(int hour) {
        this.hour = hour;
    }

    public Clock(int minute, int second) {
        this.minute = minute;
        this.second = second;
    }
}
