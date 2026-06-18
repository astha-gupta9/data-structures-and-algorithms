// LeetCode 73 - Set Matrix Zeroes

// Time Complexity: O(rows*cols)
// Space Complexity: O(1)

package Arrays;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // determining first row and col whether would be zero separately to avoid
        // setting all rows and cols to zero
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Put flags on first row and first col of the matrix for every row and col to
        // be zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        firstRowZero = true;
                    }
                    if (j == 0) {
                        firstColZero = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Setting desired rows to zero
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] != 0) {
                continue;
            }

            for (int j = 1; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }

        // Setting desired cols to zero
        for (int j = 1; j < cols; j++) {
            if (matrix[0][j] != 0) {
                continue;
            }

            for (int i = 1; i < rows; i++) {
                matrix[i][j] = 0;
            }
        }

        if (firstRowZero) {
            // Setting first row to zero
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColZero) {
            // Setting first col to zero
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
