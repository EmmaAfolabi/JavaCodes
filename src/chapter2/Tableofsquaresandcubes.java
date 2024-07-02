package chapter2;

import java.util.Scanner;

public class Tableofsquaresandcubes {
    public static void main(String[] args) {
        String number;
        String square;
        String cube;

        Scanner input = new Scanner(System.in);

        int number0 = 0;
        int square0 = 0;
        int cube0 = 0;

        int number1 = 1;
        int square1 = number1 * number1;
        int cube1 = number1 * number1 * number1;

        int number2 = 2;
        int square2 = number2 * number2;
        int cube2 = number2 * number2 * number2;

        int number3 = 3;
        int square3 = number3 * number3;
        int cube3 = number3 * number3 * number3;

        int number4 = 4;
        int square4 = number4 * number4;
        int cube4 = number4 * number4 * number4;

        int number5 = 5;
        int square5 = number5 * number5;
        int cube5 = number5 * number5 * number5;

        int number6 = 6;
        int square6 = number6 * number6;
        int cube6 = number6 * number6 * number6;

        int number7 = 7;
        int square7 = number7 * number7;
        int cube7 = number7 * number7 * number7;

        int number8 = 8;
        int square8 = number8 * number8;
        int cube8 = number8 * number8 * number8;

        int number9 = 9;
        int square9 = number9 * number9;
        int cube9 = number9 * number9 * number9;

        int number10 = 10;
        int square10 = number10 * number10;
        int cube10 = number10 * number10 * number10;

        System.out.printf("%s    %s    %s%n", "number", "square", "cube");
        System.out.printf("%d         %d         %d%n", number0, square0, cube0);
        System.out.printf("%d         %d         %d%n", number1, square1, cube1);
        System.out.printf("%d         %d         %d%n", number2, square2, cube2);
        System.out.printf("%d         %d         %d%n", number3, square3, cube3);
        System.out.printf("%d         %d        %d%n", number4, square4, cube4);
        System.out.printf("%d         %d        %d%n", number5, square5, cube5);
        System.out.printf("%d         %d        %d%n", number6, square6, cube6);
        System.out.printf("%d         %d        %d%n", number7, square7, cube7);
        System.out.printf("%d         %d        %d%n", number8, square8, cube8);
        System.out.printf("%d         %d        %d%n", number9, square9, cube9);
        System.out.printf("%d        %d       %d%n", number10, square10, cube10);


    }
}
