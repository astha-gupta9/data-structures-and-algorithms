// Leetcode 189 - Rotate Array

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n; // Discard repetitive rotations

        if (k == 0)
            return; // No rotations

        // Reverse subarray from 0 to n-k-1
        reverseArray(nums, 0, n - k - 1);

        // Reverse subarray from n-k to n-1
        reverseArray(nums, n - k, n - 1);

        // Reverse complete array
        reverseArray(nums, 0, n - 1);
    }

    private void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
