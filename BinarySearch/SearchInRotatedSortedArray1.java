// Leetcode 33 - Search in Rotated Sorted Array

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class SearchInRotatedSortedArray1 {
    public int search(int[] nums, int target) {

        // Binary Search

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // target found
            if (target == nums[mid]) {
                return mid;
            }

            // check which half of the array is sorted to find in which part the target lies and reduce search space

            // left half is sorted
            if (nums[mid] >= nums[low]) {
                // search left half
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                }
                // search right half
                else {
                    low = mid + 1;
                }
            }
            // right half is sorted
            else {
                // search right half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                }
                // search left half
                else {
                    high = mid - 1;
                }
            }
        }

        return -1; // target not found
    }
}