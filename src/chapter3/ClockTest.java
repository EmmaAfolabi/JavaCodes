package chapter3;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock time = new Clock(2, 6, 45 );
        time.setHour(18);
        time.setMinute(18);
        time.setSecond(80);

        System.out.printf("The time is %d:%d:%d", time.getHour(), time.getMinute(), time.getSecond());

    }
}
