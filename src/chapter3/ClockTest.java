package chapter3;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = 90;
        Clock clock = new Clock(hour);
        int minute = 44;
        int second = 22;
        clock = new Clock(minute, second);
        System.out.printf("%d:%d:%d",hour,minute,second);

    }
}
