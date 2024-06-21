package chapter2;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input 5 digit numbers");
        int number = input.nextInt();
        int div1 = number/10000;
        int div2 = number/1000%10;
        int div3 = number/100%10;
        int div4 = number/10%10;
        int div5 = number/1%10;

        if ( number >= 5) {
            System.out.println("Invalid digit");
            System.out.println(div1+" "+div2+" "+div3+" "+div4+" "+div5);
        }
    }
}
