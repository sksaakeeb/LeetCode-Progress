// Problem: https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Approach: Use HashSet to detect if any element repeats
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[][] tests = {
            {1, 2, 3, 4},        // false
            {1, 2, 3, 1},        // true
            {0},                 // false
            {9, 8, 7, 6, 9},     // true
            {2, 14, 18, 22, 14}  // true
        };

        for (int[] test : tests) {
            System.out.print("Input: ");
            for (int num : test) {
                System.out.print(num + " ");
            }
            System.out.println("-> Contains Duplicate? " + containsDuplicate(test));
        }
    }
}
