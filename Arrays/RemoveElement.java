// Problem: https://leetcode.com/problems/remove-element/
// Difficulty: Easy
// Approach: Two-pointer overwrite technique
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Points to the position for placing the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);
        System.out.println("Number of elements after removal: " + k);
        System.out.print("Modified array (first " + k + " elements): ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: 2, 2
    }
}
