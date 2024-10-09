package chapter4;

public class Checkerboard {
    public static void main(String[] args) {
        int row = 1;

        while (row <= 8) {

           if (row % 2 != 0) {
               for (int column = 1; column <= 8; column++) {
                   System.out.print("* ");
               }
           }

           else {
               System.out.print(" ");
               for (int column = 1; column <= 8; column++) {
                   System.out.print("* ");
               }
           }

           System.out.println();
           row++;
        }
    }
}
