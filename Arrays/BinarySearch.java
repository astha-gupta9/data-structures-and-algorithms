// LeetCode 704 - Binary Search

// Time Complexity: O(log n)
// Space Complexity: O(1)

package Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {

        // Binary search (eliminating other halves of the array to find the most valid
        // subarray that might have target)

        int low = 0;
        int high = nums.length - 1;

        // narrow the search space until target is found
        while (low <= high) {

            int mid = (low + high) / 2;

            // determine the part of the array that might have target

            // target found
            if (target == nums[mid]) {
                return mid;
            }
            // eliminating right half
            else if (target < nums[mid]) {
                high = mid - 1;
            }
            // eliminating left half
            else {
                low = mid + 1;
            }
        }

        return -1; // target doesn't exist in the array
    }
}
