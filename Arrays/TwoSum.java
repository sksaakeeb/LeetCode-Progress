// Problem: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Approach: Brute-force nested loop
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.Arrays;

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result));  // Expected: [0, 1]
    }
}
