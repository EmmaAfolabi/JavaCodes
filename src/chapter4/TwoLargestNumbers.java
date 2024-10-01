package chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int firstlargest = 0;
        int secondlargest = 0;

        System.out.println("Enter a series of ten numbers: ");

        while (counter <= 10){

            System.out.printf("Enter number %d: ", counter);
            number = input.nextInt();

            if (number > firstlargest){
                secondlargest = firstlargest;
                firstlargest = number;
            }
            else if (number > secondlargest){
                    secondlargest = number;
            }
            counter++;
        }

    }
}
