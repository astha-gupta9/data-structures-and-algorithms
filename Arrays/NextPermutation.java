// LC 31 - Next Permutation

// Time Complexity: O(n)
// Space Complexity: O(1)   

package Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {

        // pivot1 = first element which breaks decreasing order from end of the array
        int idx = nums.length - 2;
        while (idx >= 0 && nums[idx] >= nums[idx + 1]) {
            idx--;
        }
        int pivot1 = idx;

        // Array is not in decreasing order
        if (pivot1 >= 0) {
            // pivot2 = rightmost element larger than pivot1
            idx = nums.length - 1;
            while (idx > pivot1 && nums[idx] <= nums[pivot1]) {
                idx--;
            }
            int pivot2 = idx;

            // swap pivot1 and pivot2
            swap(nums, pivot1, pivot2);
        }

        // sort nums[pivot1 + 1, nums.length - 1]
        // since elements after pivot1 are in decreasing order, hence reverse subarray
        int start = pivot1 + 1;
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
