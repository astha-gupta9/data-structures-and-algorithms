// LeetCode 14 - Longest Common Prefix

// Time complexity: O(n * m)
// Space complexity: O(m)

package Strings;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        // store longest prefix
        StringBuilder prefix = new StringBuilder(strs[0]);

        // Tracks prefix length
        int prefixLen = prefix.length();

        // Traverse array
        for (int i = 1; i < strs.length; i++) {

            // get valid traversal length
            int limit = Math.min(prefixLen, strs[i].length());

            // get valid prefix length
            int j = 0;
            while (j < limit && strs[i].charAt(j) == prefix.charAt(j)) {
                j++;
            }
            prefixLen = j;

            // no prefix
            if (prefixLen == 0) {
                break;
            }
        }

        return prefix.substring(0, prefixLen); // Result
    }
}