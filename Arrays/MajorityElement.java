// LeetCode 169 - Majority Element

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        int num = 0; // stores majority element
        int count = 0; // counts the occurence of majority element
        // since, majority element will occur more than n/2 times
        // hence, after cancelling out every occurence of each element with other
        // non-majority elements, majority element will never be completely canceled out

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                num = nums[i]; // update majority element
            }

            // count occurence
            if (nums[i] != num) {
                count--;
            } else {
                count++;
            }
        }

        return num; // Result
    }
}
