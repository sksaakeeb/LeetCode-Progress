// Problem: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy
// Approach: Trim spaces and iterate backward
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim(); // Remove trailing and leading spaces
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String input1 = "Hello World";
        String input2 = "   fly me   to   the moon  ";
        String input3 = "a";

        System.out.println("Input: \"" + input1 + "\" → Output: " + lengthOfLastWord(input1)); // 5
        System.out.println("Input: \"" + input2 + "\" → Output: " + lengthOfLastWord(input2)); // 4
        System.out.println("Input: \"" + input3 + "\" → Output: " + lengthOfLastWord(input3)); // 1
    }
}
