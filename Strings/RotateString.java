// LeetCode 796 - Rotate String

// Time complexity - O(n)
// Space complexity - O(n)

package Strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {

        // Unequal length strings can never be same
        // s = A + B
        // rotated s = B + A
        // s + s = A + (B + A) + B
        // hence, goal is a substring of s + s
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
