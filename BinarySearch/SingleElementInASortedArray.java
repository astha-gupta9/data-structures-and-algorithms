// LeetCode 540 - Single Element in a Sorted Array

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        // Binary Search

        int low = 0;
        int high = n - 1;

        /*
         * target = single element
         * 
         * pairs occur on:
         * first occurrence -> even idx
         * second occurrence -> odd idx
         * 
         * after target,
         * 
         * pairs occur on:
         * first occurrence -> odd idx
         * second occurrence -> even idx
         */

        while (low < high) {

            int mid = (low + high) / 2;

            /*
             * even idx ^ 1 = odd idx
             * odd idx ^ 1 = even idx
             */

            // pair before target
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1; // target on right
            }
            // pair after target
            else {
                high = mid; // target on left
            }
        }

        return nums[low]; // single element
    }
}
