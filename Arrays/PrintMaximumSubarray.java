// GFG - Maximum Subarray

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

import java.util.ArrayList;

public class PrintMaximumSubarray {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        
        int currStart = -1;     // Start index of current subarray
        long currSum = 0;     // Sum of current subarray
        int currLength = 0;     // Length of current subarray
        int bestStart = -1;     // Start index of subarray with max sum and longest length
        long bestSum = 0;     // Max sum found
        int bestLength = 0;     // Longest length subarray with max sum
        
        // Traverse array
        for (int i = 0; i < arr.length; i++) {
            
            // When element is non-negative
            if (arr[i] >= 0) {
                if (currStart == -1) {
                    currStart = i;     // Update start index of current subarray
                }
                currSum += arr[i];     // Update sum of current subarray
                currLength++;     // Update length of current subarray
            }
            // When element is negative
            else {
                
                // Update max sum, max length and shortest start index
                if (bestSum < currSum 
                || (bestSum == currSum && bestLength < currLength)) {
                    bestSum = currSum;
                    bestLength = currLength;
                    bestStart = currStart;
                }
                
                // Reset current values
                currSum = 0;
                currLength = 0;
                currStart = -1;
            }
        }
        
        // Track last valid subarray
        if (bestSum < currSum 
        || (bestSum == currSum && bestLength < currLength)) {
            bestSum = currSum;
            bestLength = currLength;
            bestStart = currStart;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if (bestStart == -1) {     // All array elements are negative
            result.add(-1);
        }
        else {
            for (int i = bestStart; i < bestStart + bestLength; i++) {
                result.add(arr[i]);
            }
        }
        
        return result;     // Result
    }
}
