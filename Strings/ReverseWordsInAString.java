// LeetCode 151 - Reverse Words in a String

// Time complexity - O(n)
// Space complexity - O(n)

package Strings;

public class ReverseWordsInAString {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        // Word tracker
        int end = s.length() - 1;

        // Traverse string
        while (end >= 0) {

            // Word found
            if (s.charAt(end) != ' ') {
                int start = end;

                while (start >= 0 && s.charAt(start) != ' ') {
                    start--;
                }

                // Append space when result is non-empty
                if (!result.isEmpty()) {
                    result.append(" ");
                }

                // Append word in reverse order
                result.append(s.substring(start + 1, end + 1));

                // Move pointer
                end = start;
            } else {
                end--;
            }
        }

        return result.toString();     // Result
    }
}
