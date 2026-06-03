// Leetcode 1 - Two Sum

// Pattern - Hashmap + Complement Lookup 

// Time complexity - O(n)
// Space complexity - O(n)

package Arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // num1 + num2 = target
        // Hence, num2 = target - num1
        
        // To store elements of array for O(1) lookup
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        // Traverse array
        for (int i = 0; i < nums.length; i++) {

            // Complement
            int num2 = target - nums[i];
            
            // Complement lookup
            if (map.containsKey(num2)) {
                result[0] = i;
                result[1] = map.get(num2);
                break;
            }

            map.put(nums[i], i);
        }

        return result;     // Result
    }
}
