// GFG - Find nth Root of m

// Time Complexity: O(log(m) * n)
// Space Complexity: O(1)

package BinarySearch;

public class FindNthRoot {
    public int nthRoot(int n, int m) {
        // code here

        // Binary Search on answer

        // Search space
        int low = 0;
        int high = m;

        while (low <= high) {

            int mid = (low + high) / 2;

            int val = check(mid, n, m); // check whether root or not

            if (val == 0) { // root found
                return mid;
            } else if (val < 0) { // root exists on right side
                low = mid + 1;
            } else { // root exists on left side
                high = mid - 1;
            }
        }

        return -1; // root is not an integer
    }

    // check whether mid is nth root or not
    private int check(int num, int n, int m) {

        long product = 1; // calc num^n

        // iteratively multiplying num n times to check whether num is nth root of m
        for (int i = 1; i <= n; i++) {

            product *= num;

            if (product > m) { // num^n > m
                return 1;
            }
        }

        if (product == m) { // root found i.e., num^n = m
            return 0;
        }

        return -1; // num^n < m
    }
}
