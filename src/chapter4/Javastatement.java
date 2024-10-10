package chapter4;

import java.util.Scanner;

public class Javastatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 5;

        x += x++ - 5;
        System.out.printf("The value of x is : %d%n", x);
    }
}
