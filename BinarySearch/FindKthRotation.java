package BinarySearch;

public class FindKthRotation {
    public int findKRotation(int arr[]) {
        // Code here

        // Binary Search

        int low = 0;
        int high = arr.length - 1;

        // No of rotations is equal to the index of the smallest element in the array

        // Tracking the minimum element without storing it

        while (low < high) { // only element left at the end would be the minimum i.e., when low == high

            int mid = (low + high) / 2;

            // after possibly rotating the sorted array:
            // both left half and right half of the array are sorted
            // only left half of the array is sorted
            // only right half of the array is sorted

            // unsorted part of the array = (rightmost elements of original array) +
            // (leftmost elements of original array)=

            // right half is sorted
            // since arr[mid] would be the minimum among arr[mid + 1 to high]
            // hence search arr[low to mid]
            if (arr[mid] < arr[high]) {
                high = mid;
            }
            // left half is sorted
            // since arr[low] would be the minimum among arr[low to mid]
            // hence search arr[mid + 1 to high]
            else {
                low = mid + 1;
            }
        }

        return low; // number of rotations
    }
}
