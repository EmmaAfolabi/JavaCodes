package Chapter6;

import java.util.Scanner;

public class Multiples {
    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter series length: ");
        int series = input.nextInt();
        int num1, num2;
        for (int r = 1; r <= series; r++) {
            System.out.print("Enter number pair separated by space: ");
            num1 = input.nextInt();
            num2 = input.nextInt();

            System.out.println(isMultiple(num1, num2) ? "is Multiple" : "is not Multiple");
        }
        input.close();
    }
}
