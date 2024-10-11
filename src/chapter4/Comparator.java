package chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstnumber = input.nextInt();

        System.out.println("Enter the second number: ");
        int secondnumber = input.nextInt();

        do {
            if (firstnumber == secondnumber) {
                System.out.println("0");
            }
            if (firstnumber > secondnumber) {
                System.out.println("1");
            }
            if (secondnumber > firstnumber) {
                System.out.println("-1");
            }
        }while (firstnumber == secondnumber && firstnumber > secondnumber && secondnumber > firstnumber);
    }
}
