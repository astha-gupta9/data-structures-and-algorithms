// LeetCode 81 - Search in Rotated Sorted Array II

// Time Complexity: O(log n), O(n) in worst case when all elements are duplicates
// Space Complexity: O(1)

package BinarySearch;

public class SearchInRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {

        // Binary Search

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // target found
            if (target == nums[mid]) {
                return true;
            }
            // can't determine which half is sorted due to duplicates
            else if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            // left half is sorted
            else if (nums[mid] >= nums[low]) {
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
            else if (nums[mid] <= nums[high]) {
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

        return false; // target not found
    }
}
