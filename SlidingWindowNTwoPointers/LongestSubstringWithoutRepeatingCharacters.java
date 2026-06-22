// LeetCode 3 - Longest Substring Without Repeating Characters

// Time complexity: O(n)
// Space complexity: O(n)

package SlidingWindowNTwoPointers;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        
        // tracks duplicates in current substring
        HashMap<Character, Integer> map = new HashMap<>();

        // tracks length of valid substring
        int validStrLen = 0;

        // traverse string and maintain window for valid substring

        int st = 0;      // start idx of longest valid substring
        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);

            // repeating char encountered
            if (map.getOrDefault(ch, -1) != -1 && map.getOrDefault(ch, -1) >= st) {
                st = map.get(ch) + 1;
            }

            map.put(ch, end);     // map curr character

            // update valid substring length
            validStrLen = Math.max(validStrLen, end - st + 1);
        }

        return validStrLen;     // result
    }
}