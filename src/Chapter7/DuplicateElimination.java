package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        Arrays.fill(nums, -1);

        // Input: exactly 10 numbers
        for (int i = 0; i < nums.length; i++) {
            int v;
            while (true) {
                System.out.println("Enter number " + (i + 1) + " (10-100): ");
                v = scanner.nextInt();
                if (v >= 10 && v <= 100) break;
                System.out.println("Out of range. Try again.");
            }
            nums[i] = v;
        }
    }
}
