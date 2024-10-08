package chapter4;

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

}
