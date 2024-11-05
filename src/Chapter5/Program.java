package Chapter5;

public class Program {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 3; j++) {
                for (k = 1; k <= 4; k++) {
                    System.out.print('*');
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}
