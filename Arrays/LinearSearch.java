// GFG - Array Search

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

public class LinearSearch {
    public int search(int arr[], int x) {
        // code here

        // Traverse array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) { // x found
                return i; // Return index of x in the array
            }
        }

        return -1; // x doesn't exist in the array
    }
}
