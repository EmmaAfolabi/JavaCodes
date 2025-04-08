package Codegym7;

import java.util.Scanner;

public class maxandminvalue {
        public static void main(String[] args) {
            //bytes

            int[] a;
            a = new int[5];

            Scanner scanner = new Scanner(System.in);


            int[] numbers = {9, 2, 23, -2, 0, 99};

            if (numbers.length > 0) {
                int min = numbers[0];
                int max = numbers[0];
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                System.out.println("min is " + min);
                System.out.println("max is " + max);
            } else {
                System.out.println("Error, empty array");
            }
        }
}
