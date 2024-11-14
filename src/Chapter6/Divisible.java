package Chapter6;

import java.util.Scanner;

public class Divisible {
    // method to check if a number is divisible by 5
    public static boolean isDivisible(int number) {
        return number % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers to check if it's divisible by 5: ");

        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            if (isDivisible(input)) {
                System.out.printf("%d is divisible by 5.%n", input);
            } else {
                System.out.printf("%d is not divisible by 5.%n", input);
            }
        }
        scanner.close();
    }
}
