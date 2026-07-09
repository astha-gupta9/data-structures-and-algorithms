// GFG - Floor in a Sorted Array

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BinarySearch;

public class FloorInSortedArray {
    public int findFloor(int[] arr, int x) {
        // code here

        // Binary Search

        int low = 0;
        int high = arr.length - 1;

        int floorIdx = -1;      // if floor doesn't exist

        while (low <= high) {

            int mid = (low + high) / 2;

            // could be a possible floor, look if there exists a better floor in the right half
            if (arr[mid] <= x) {
                floorIdx = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return floorIdx;
    }
}