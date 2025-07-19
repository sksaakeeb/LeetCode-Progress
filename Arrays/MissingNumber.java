// Problem: https://leetcode.com/problems/missing-number/
// Difficulty: Easy
// Approach: Sum Formula (Expected Sum - Actual Sum)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {3, 0, 1},     // Missing 2
            {0, 1},        // Missing 2
            {9,6,4,2,3,5,7,0,1}, // Missing 8
            {0}            // Missing 1
        };

        for (int[] test : tests) {
            System.out.println("Missing Number: " + missingNumber(test));
        }
    }
}
