// LeetCode 34 - Find First and Last Position of Element in Sorted Array

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class FirstAndLastOccurrence {
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[] { -1, -1 };

        // start position of target

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (target <= nums[mid]) {
                if (target == nums[mid]) {
                    result[0] = mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // end position of target

        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (target >= nums[mid]) {
                if (target == nums[mid]) {
                    result[1] = mid;
                }
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}