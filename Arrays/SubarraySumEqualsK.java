// LeetCode 560 - Subarray Sum Equals K

// Time complexity: O(n)
// Space complexity: O(n)

package Arrays;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        
        // for O(1) lookup for previous seen sums
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int currSum = 0;      // current running sum
        int result = 0;       // count of valid subarrays
        
        // traverse array
        for (int i = 0; i < nums.length; i++) {

            // update running sum
            currSum += nums[i];

            // since A + B = k
            // therefore B = k - A
            // if B found, that means k exists

            // k found
            int val = currSum - k;
            if (map.containsKey(val)) {
                result += map.get(val);      // count of valid subarrays updated
            }

            // update set with running sum
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return result;
    }
}
