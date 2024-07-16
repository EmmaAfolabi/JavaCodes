package chapter4;

import java.util.Scanner;

public class Sumofintegers {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        x = y++ ;
        System.out.printf("x = %d%n", x);
        x = ++y;
        System.out.printf("x = %d%n", x);
    }
}
