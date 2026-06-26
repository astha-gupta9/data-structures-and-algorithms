// LeetCode 118 - Pascal's Triangle

// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // Row 1
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);

        // Rest rows
        for (int i = 1; i < numRows; i++) {
            temp = new ArrayList<>();
            temp.add(1);    // First element

            List<Integer> prev = ans.get(i - 1);

            for (int j = 1; j < i; j++) {
                temp.add(prev.get(j - 1) + prev.get(j));
            }

            temp.add(1);    // Last element
            ans.add(temp);
        }

        return ans;
    }
}