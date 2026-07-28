// LeetCode 69 - Sqrt(x)

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class FindSquareRoot {
    public int mySqrt(int x) {

        // Binary Search on Answer

        // Search Space
        int low = 0;
        int high = x;

        while (low <= high) {

            int mid = low + (high - low) / 2; // Avoid int overflow

            if ((long) mid * mid <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high; // square root
    }
}