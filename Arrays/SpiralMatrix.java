// LeetCode 54 - Spiral Matrix

// Time Complexity: O(m*n)
// Space Complexity: O(1)

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        
        List<Integer> result = new ArrayList<>();

        int startRow = 0, endRow = m - 1;
        int startCol = 0, endCol = n - 1;
        while (startRow <= endRow && startCol <= endCol) {

            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;

            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    result.add(matrix[endRow][i]);
                }
                endRow--;
            }

            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }
}
