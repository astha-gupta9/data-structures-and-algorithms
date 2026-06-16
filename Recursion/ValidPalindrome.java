// LeetCode 125 - Valid Palindrome

// Time complexity: O(n)
// Space complexity: O(n) - for recursive stack space

package Recursion;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        // converting string s into complete lowercase chars and checking whether
        // palindrome or not
        return isPalindromeRecur(s.toLowerCase(), 0, s.length() - 1);
    }

    // recursive function to find whether palindrome or not
    private boolean isPalindromeRecur(String s, int st, int end) {

        // reached middle of string
        if (st >= end) {
            return true;
        }

        // increment st pointer till next alphanumeric char is found
        if (!isAlphaNumeric(s.charAt(st))) {
            return isPalindromeRecur(s, st + 1, end);
        }
        // decrement end pointer till next alphanumeric char is found
        else if (!isAlphaNumeric(s.charAt(end))) {
            return isPalindromeRecur(s, st, end - 1);
        }
        // traverse string till i we reach middle of string
        else if (s.charAt(st) == s.charAt(end)) {
            return isPalindromeRecur(s, st + 1, end - 1);
        }

        return false; // char mismatched at respective positions hence not palindrome
    }

    // function to find whether curr char is alphanumeric or not
    private boolean isAlphaNumeric(char ch) {
        if ((ch >= 48 && ch <= 57)
                || (ch >= 65 && ch <= 90)
                || (ch >= 97 && ch <= 122)) {
            return true;
        }

        return false;
    }
}
