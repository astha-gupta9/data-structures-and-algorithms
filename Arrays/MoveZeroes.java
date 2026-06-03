// Leetcode 283 - Move Zeroes

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int write = 0;

        // Traverse array
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) { // Non zero element found

                if (read != write) { // Avoid unnecessary swaps
                    // Swap
                    int temp = nums[read];
                    nums[read] = nums[write];
                    nums[write] = temp;
                }

                write++;
            }
        }
    }
}
