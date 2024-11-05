package Chapter5;

public class BreakReplace {
    public static void main(String[] args) {
        int count;
        boolean shouldContinue = true;

        for (count = 1; count <= 10 && shouldContinue; count++) {
            if (count == 5) {
                shouldContinue = false;
            } else {
                System.out.printf("%d", count);
            }
        }

        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}
