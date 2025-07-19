// Problem: https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Approach: Sort both strings and compare
// Time Complexity: O(n log n) due to sorting
// Space Complexity: O(n)

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String[][] tests = {
            {"anagram", "nagaram"},
            {"rat", "car"},
            {"listen", "silent"},
            {"hello", "billion"}
        };

        for (String[] pair : tests) {
            String s = pair[0], t = pair[1];
            System.out.printf("Input: \"%s\", \"%s\" → Output: %b%n", s, t, isAnagram(s, t));
        }
    }
}
