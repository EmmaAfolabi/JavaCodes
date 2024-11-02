package Chapter5;

import java.util.Scanner;

public class Extremes {
    public void findMinMaxSum() {
        int i = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers you want to input: ");
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

        int sum = minimum + maximum;
        System.out.printf("Minimum value is %d%n", minimum);
        System.out.printf("Largest value is %d%n", maximum);
        System.out.printf("Sum of minimum and maximum values: %d%n", sum);
    }

    public static void main(String[] args) {
        Extremes indent = new Extremes();
        indent.findMinMaxSum();
    }
}
