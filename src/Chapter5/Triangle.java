package Chapter5;

public class Triangle {

    public static void main(String[] args) {

        //Triangle A
        System.out.println("Triangle A");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        //Triangle B
        System.out.println("Triangle B");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();


        //Triangle C
        System.out.println("Triangle D");
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        //Triangle D
        System.out.println("Triangle C");
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
    }
}
