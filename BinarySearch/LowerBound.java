// GFG - Implement Lower Bound

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class LowerBound {

    int lowerBound(int[] arr, int target) {
        // code here

        // Binary Search

        int low = 0;
        int high = arr.length - 1;

        int result = arr.length; // lower bound of the target (if not found, then length of the array)

        // subarray with elements greater than or equal to target can have lower bound
        while (low <= high) {

            int mid = (low + high) / 2;

            // could be the possible lower bound hence store it and check further for a
            // better answer in left half
            if (arr[mid] >= target) {
                result = mid;
                high = mid - 1;
            }

            // left half contains elements smaller than target hence, lower bound exist in
            // the right half
            else {
                low = mid + 1;
            }
        }

        return result; // lower bound
    }
}