package Codegym7;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //bytes

        int[] a;
        a = new int[5];
        int[] b = {1, 2, 3, 4, -5, -23};

        Scanner scanner = new Scanner(System.in);

        int length;
        do {
            System.out.println("Enter the length");
            length = scanner.nextInt();
        } while (length <0);

        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number" + (i+1));
            int num = scanner.nextInt();
            numbers[i] = num;
        }

        System.out.println(b.length);
    }
}
