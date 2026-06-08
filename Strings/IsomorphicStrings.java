// LeetCode 205 - Isomorphic Strings

// Time complexity: O(n)
// Space complexity: O(1) - at most 256 characters

package Strings;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        // Map for string s
        int[] mapS = new int[256];

        // Map for string t
        int[] mapT = new int[256];

        // Traverse strings
        for (int i = 0; i < s.length(); i++) {

            int chS = s.charAt(i); // ascii value of curr char of string s
            int chT = t.charAt(i); // ascii value of curr char of string t

            // chars didn't map to same indices, hence not isomorphic
            if (mapS[chS] != mapT[chT]) {
                return false;
            }

            // chars mapped, store same current idx to both chars
            mapS[chS] = i + 1;
            mapT[chT] = i + 1;
        }

        return true; // strings are isomorphic
    }
}