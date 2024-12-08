package Chapter7;


public class PassArray {
    // main creates array and calls modifyArray and modifyElement
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.printf(
                "Effects of passing reference to entire array:%n" +
                        "The values of the original array are:%n");

        // output original array elements
        for (int value : array) {
            System.out.printf("   %d", value);
        }

        modifyArray(array);  // pass array reference
        System.out.printf("%n%nThe values of the modified array are:%n");
    }
}
