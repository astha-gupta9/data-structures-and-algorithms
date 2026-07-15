// LeetCode 153 - Find Minimum in Rotated Sorted Array

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {

        // Binary Search

        int low = 0;
        int high = nums.length - 1;

        // minimum would never leave the search space (tracking minimum rather than
        // storing it)

        // minimum never leaves the search space, hence only element (low == high) would
        // be the minimum
        while (low < high) {

            int mid = (low + high) / 2;

            // if both halves are sorted, then left half would always be having minimum
            // value (array sorted in ascending order)

            // if only right half is sorted, then either mid or left half would be having
            // the minimum element

            if (nums[high] >= nums[mid]) {
                high = mid;
            }

            // if only left half is sorted, then by the possible rotation, right half must
            // be having minimum
            else {
                low = mid + 1;
            }
        }

        return nums[low];
    }
}
