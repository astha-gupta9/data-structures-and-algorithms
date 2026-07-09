// GFG - Ceil in a Sorted Array

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class CeilInSortedArray {
    public int findCeil(int[] arr, int x) {
        // code here

        // Binary Search

        int low = 0;
        int high = arr.length - 1;

        int ceilIdx = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // could be a possible ceil, look if there exists a better ceil in the left half
            if (arr[mid] >= x) {
                ceilIdx = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ceilIdx;
    }
}
