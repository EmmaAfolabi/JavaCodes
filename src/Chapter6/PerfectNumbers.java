package Chapter6;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        displayPerfect_n();
        in.close();
    }

    public static boolean isPerfect(long number) {
        long div = number / 2, temp, sum = 0;
        String store = "";

        for (int i = 1; i <= div; i++) {
            temp = number % i;
            if (temp == 0) {
                sum += i;
                store = store + i + ", ";
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number: " + store + "= " + sum);
            return true;
        }
        return false;
    }

    public static void displayPerfect_n() {
        for (long i = 1; i <= 1000; i++) {
            isPerfect(i);
        }
    }
}
