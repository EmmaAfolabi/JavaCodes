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
            nums[i] = v; // store as read; duplicates allowed for now
        }

        // Remove duplicates: for each value, mark later duplicates as -1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) nums[j] = -1;
            }
        }

        // Display only non -1 values
        System.out.println("\nUnique values entered:");
        for (int v : nums) {
            if (v != -1) System.out.println(v);
        }
    }
}
