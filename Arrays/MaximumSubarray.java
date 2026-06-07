// LeetCode 53 - Maximum Subarray

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        
        int currSum = nums[0];     // Track current subarray sum
        int maxSum = nums[0];      // Track max subarray sum

        // Traverse array
        for (int i = 1; i < nums.length; i++) {
            
            // Update current subarray sum
            // Negative current subarray sum could be neglected as it will not contribute in increasing the current subarray sum
            currSum = Math.max(nums[i], currSum + nums[i]);

            // Update maximum subarray sum
            // For all negative elements, maximum value of the subarray would be max sum subarray
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;     // Maximum subarray sum
    }
}
