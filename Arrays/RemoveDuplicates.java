// Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy
// Approach: Two Pointer (j tracks the last unique element)
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + length);
        System.out.print("Modified array (first " + length + " elements): ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: 1 2 3
    }
}
