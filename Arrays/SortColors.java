// Leetcode 75 - Sort Colors

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

public class SortColors {
    public void sortColors(int[] nums) {

        // Ptrs for each object
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        // Traverse array till all the objects get sorted
        // Track array with white ptr
        while (white <= blue) {

            // Swap red and white object
            if (nums[white] == 0) {
                swap(nums, red, white);
                red++;
                white++; // Because indices (0, w-1) are already explored, they can only have either red or white object and we are already swapping red object, hence will only get white object swapped back
            }
            // Swap blue and white object
            else if (nums[white] == 2) {
                swap(nums, white, blue);
                blue--;
            }
            // White object
            else {
                white++;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
