package Chapter5;

public class ContinueReplace {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count != 5) {
                System.out.printf("%d ", count);
            }
        }

        System.out.printf("%nUsed if statement to skip printing 5%n");
    }
}
