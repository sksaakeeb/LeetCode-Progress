// Problem: https://leetcode.com/problems/plus-one/
// Difficulty: Easy
// Approach: Start from the last digit and handle carry
// Time Complexity: O(n)
// Space Complexity: O(n) in worst case (like [9,9,9])

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // Case 1: No carry needed
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Case 2: Carry needed, set to 0 and continue
            digits[i] = 0;
        }

        // Case 3: All 9s (e.g., [9,9,9] → [1,0,0,0])
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // All other digits are already 0
        return newDigits;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {1, 2, 9};
        int[] input3 = {9, 9, 9};

        System.out.println("Input: [1,2,3] → Output: " + Arrays.toString(plusOne(input1))); // [1,2,4]
        System.out.println("Input: [1,2,9] → Output: " + Arrays.toString(plusOne(input2))); // [1,3,0]
        System.out.println("Input: [9,9,9] → Output: " + Arrays.toString(plusOne(input3))); // [1,0,0,0]
    }
}
