package Codegym7;

import java.io.IOException;

public class Example4 {
    public static void main(String[] args) throws IOException {
        // static initialization
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        // calculate the sum
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];

            System.out.println("Sum is " + sum);
        }
    }
}
