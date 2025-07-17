// Problem: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Approach: Convert integer to string and compare with its reverse
// Time Complexity: O(n) where n is number of digits
// Space Complexity: O(n) for the reversed string

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return s.equals(reverse);
    }

    public static void main(String[] args) {
        int test1 = 121;
        int test2 = -121;
        int test3 = 10;

        System.out.println("Input: " + test1 + " → Output: " + isPalindrome(test1)); // true
        System.out.println("Input: " + test2 + " → Output: " + isPalindrome(test2)); // false
        System.out.println("Input: " + test3 + " → Output: " + isPalindrome(test3)); // false
    }
}
