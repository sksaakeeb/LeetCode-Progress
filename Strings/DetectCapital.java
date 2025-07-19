// Problem: https://leetcode.com/problems/detect-capital/
// Difficulty: Easy
// Approach: Count uppercase letters and check valid conditions
// Time Complexity: O(n)
// Space Complexity: O(1)

public class DetectCapital {

    public static boolean detectCapitalUse(String word) {
        int capitalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        return capitalCount == word.length() ||
               capitalCount == 0 ||
               (capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        String[] tests = {
            "USA",       // true
            "leetcode",  // true
            "Google",    // true
            "FlaG"       // false
        };

        for (String test : tests) {
            System.out.println("Word: " + test + " -> " + detectCapitalUse(test));
        }
    }
}
