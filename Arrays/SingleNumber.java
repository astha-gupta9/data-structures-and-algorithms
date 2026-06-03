package Arrays;
// LeetCode 136 - Single Number

// Time complexity - O(n)
// Space complexity - O(1)

class SingleNumber {
    public int singleNumber(int[] nums) {

        int xor = 0;

        // Calculate XOR of all elements of array
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }

        return xor; // Return single element
    }
}