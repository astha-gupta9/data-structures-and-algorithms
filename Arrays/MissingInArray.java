// GFG - Missing In Array

// Time complexity - O(n)
// Space complexity - O(1)

package Arrays;

public class MissingInArray {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;

        // XOR all nums from 1 to n and all array elements
        // Since, even number of occurences cancel each other in XOR
        // Therefore, number with odd number of occurences is i.e., missing element
        // which would only be present in 1 to n list will have 1 occurence
        // Hence, after XOR of all these numbers only that element will be left
        int xor = n + 1;

        for (int i = 1; i <= n; i++) {
            xor ^= i; // XOR of 1 to n
            xor ^= arr[i - 1]; // XOR of arr[] elements
        }

        return xor; // Missing element
    }
}
