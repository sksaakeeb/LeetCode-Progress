// Problem: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Approach: Optimal In-Place Swapping
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swapping nums[i] and nums[j]
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] tests = {
            {0,1,0,3,12},
            {1,0,2,0,3},
            {0,0,0,1},
            {1,2,3,0,0}
        };

        for (int[] test : tests) {
            System.out.println("Before: " + Arrays.toString(test));
            moveZeroes(test);
            System.out.println("After:  " + Arrays.toString(test));
            System.out.println();
        }
    }
}
