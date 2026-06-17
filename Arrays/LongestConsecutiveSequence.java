// LeetCode 128 - Longest Consecutive Sequence

// Time Complexity: O(n) - each element of the array is visited at most twice
// Space Complexity: O(n)

package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        
        // adding elements to set to avoid irrelevant excess traversals
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }

        // longest consecutive elements sequence
        int maxLen = 0;

        // traverse set
        for (int num : numsSet) {
            
            // this element is not the first element of a sequence
            if (numsSet.contains(num - 1)) {
                continue;
            }

            // first element of a sequence found
            // track sequence length
            int seqLen = 0;
            while (numsSet.contains(num)) {
                seqLen++;
                num++;
            }

            // update longest consecutive elements sequence
            maxLen = Math.max(maxLen, seqLen);
        }

        return maxLen;      // result
    }
}
