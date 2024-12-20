package chapter4;

import java.util.Scanner;

public class ConvertBinary {

    public int convertbinary (int number) {
        int total =0;
        int counter = 1;
        int remainder;
        int decimal;

        while (number > 0) {
            remainder = number % 10;
            decimal = remainder * counter;
            total += decimal;
            number = number / 10;
            counter *= 2;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary Number: ");
        int number = input.nextInt();

        ConvertBinary type = new ConvertBinary();
        System.out.printf("Decimal equivalent is: %d ", type.convertbinary(number));
    }

}
