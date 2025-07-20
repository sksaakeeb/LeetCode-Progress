// Problem: https://leetcode.com/problems/max-consecutive-ones/
// Difficulty: Easy
// Approach: Count consecutive 1s and track maximum
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1, 1, 0, 1, 1, 1},    // Output: 3
            {1, 0, 1, 1, 0, 1},    // Output: 2
            {0, 0, 0},             // Output: 0
            {1, 1, 1, 1, 1}        // Output: 5
        };

        for (int[] test : tests) {
            System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(test));
        }
    }
}
