package chapter2;

import java.util.Scanner;

public class Welcome1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int x = input.nextInt();

        System.out.println("Enter the second integer: ");
        int y = input.nextInt();
        System.out.printf("%d = %d%n", (x + y), (y + x));
    }
}
