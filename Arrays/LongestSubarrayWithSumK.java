// GFG - Longest Subarray with Sum K

// Time complexity - O(n)
// Space complexity - O(n)

package Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        // Store prefix sums with their first occurence index
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        
        // Initialize map with 0 so that when running sum becomes equal to k, max length is updated
        prefixSumMap.put((long)0, -1);
        
        long currSum = 0;     // Running sum of the array
        int maxLen = 0;     // Maximum length of the subarray with sum k
        
        // Traverse array
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];     // Update current sum
            
            int j = prefixSumMap.getOrDefault(currSum - k, -2);
            
            // If (currSum - k) already present in the map then subarray(j, i) is equal to k
            // currSum = sum from 0 to i, k = sum from j to i, (currSum - k) = sum from 0 to j
            if (j != -2) {
                maxLen = Math.max(maxLen, i - j);     // Update max length of subarray with sum k
            }
            
            // If prefix sum not stored in the map then store it
            if (!prefixSumMap.containsKey(currSum)) {
                prefixSumMap.put(currSum, i);
            }
        }
        
        return maxLen;     // Result
    }
}
