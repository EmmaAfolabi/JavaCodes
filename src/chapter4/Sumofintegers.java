package chapter4;

import java.util.Scanner;

public class Sumofintegers {
    public static void main(String[] args) {
        int x = 5;
        int product = 5;

        product *= x++;
        System.out.printf("Product = %d%n", product);
        System.out.printf("x = %d%n", x);
    }
}
