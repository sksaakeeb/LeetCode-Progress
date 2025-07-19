/*
 * Problem: Majority Element (LeetCode 169)
 * Approach: Brute Force
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class MajorityElement {

    // Method to find the majority element
    public static int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1; // If no majority element found
    }

    // Main method to test the logic
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
