// LeetCode 242 - Valid Anagram

// Time Complexity: O(n)
// Space Complexity: O(1)

package Strings;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // Store char frequency of strings
        int[] map = new int[26];

        // Do +1 for each occurrence of string s
        for (char ch : s.toCharArray()) {
            map[ch - 'a']++;
        }
        // Do -1 for each occurrence of string t
        for (char ch : t.toCharArray()) {
            map[ch - 'a']--;
        }

        // If there are same number of chars and same occurence of letters in both
        // strings, then all values of chars would be zero
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }

        return true;
    }
}