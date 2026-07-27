// LeetCode 162 - Find Peak Element

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        // Binary Search

        int low = 0;
        int high = nums.length - 1;

        // peak always in the search space
        while (low < high) {

            int mid = (low + high) / 2;

            // slope increasing -> peak in right
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }
            // slope decreasing -> peak in left
            else {
                high = mid;
            }
        }

        return low; // index of a peak
    }
}
