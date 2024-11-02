package Chapter5;

import java.util.Scanner;

public class Extremes {
    public void findMinMaxSum() {
        int i = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int counter = input.nextInt();

        System.out.println("Enter the values: ");
        int next = input.nextInt();

        int minimum = next;
        int maximum = next;

        while (i < counter) {
            next = input.nextInt();

            if (next < minimum) {
                minimum = next;
            }

            if (next > maximum) {
                maximum = next;
            }

            i++;
        }
    }
}
