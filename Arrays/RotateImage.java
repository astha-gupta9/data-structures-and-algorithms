// LeetCode 48 - Rotate Image

// Time complexity: O(n^2)
// Space complexity: O(1)

package Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // 90 deg clockwise rotation = transpose + reverse col order

        // convert matrix into its transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse order of cols in matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
