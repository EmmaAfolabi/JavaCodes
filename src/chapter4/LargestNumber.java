package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number;
        int largest;

        System.out.printf("Enter the first number: %n");
        number = input.nextInt();

        largest = number;
        counter++;

        while (counter < 10){
            System.out.printf("Enter the next number: %n");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
            counter ++;
        }
        System.out.printf("The largest of %d numbers is: %d%n", counter, largest);
    }
}
