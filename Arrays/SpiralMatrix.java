// LeetCode 54 - Spiral Matrix

// Time Complexity: O(m*n)
// Space Complexity: O(1)

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        // Row and col ptrs tracking spiral traversal
        int stRow = 0;
        int endRow = matrix.length - 1;
        int stCol = 0;
        int endCol = matrix[0].length - 1;

        // to store spiral order of matrix
        List<Integer> result = new ArrayList<>();

        // traverse matrix
        while (stRow <= endRow && stCol <= endCol) {

            // top row of current loop
            for (int i = stCol; i <= endCol; i++) {
                result.add(matrix[stRow][i]);
            }
            stRow++;

            // right col of current loop
            for (int i = stRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;

            // avoid repeating elements in case of rectangular matrix
            if (stRow > endRow || stCol > endCol) {
                break;
            }

            // bottom row of current loop
            for (int i = endCol; i >= stCol; i--) {
                result.add(matrix[endRow][i]);
            }
            endRow--;

            // left col of current loop
            for (int i = endRow; i >= stRow; i--) {
                result.add(matrix[i][stCol]);
            }
            stCol++;
        }

        return result; // result
    }
}
