package chapter4;

import java.util.Scanner;

public class Cryptography {
    public String encryptNumber(int digits) {
        int value1 =0, value2 =0, value3 =0, value4 =0;

        value4 = ((digits % 10) + 7) % 10;
        digits /= 10;
        value3 = ((digits % 10) + 7) % 10;
        digits /= 10;
        value2 = ((digits % 10) + 7) % 10;
        digits /= 10;
        value1 = ((digits % 10) + 7) % 10;

        String encrypted = value3 + "" + value4 + "" + value1 + "" + value2;
        return encrypted;
    }

    public static void main(String[] args) {
        Cryptography message = new Cryptography();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter digits to encrypt: ");
        int digits = input.nextInt();

        System.out.printf("Encrypted value is %n%s", message.encryptNumber(digits));
    }
}
