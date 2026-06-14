// GFG - Array Leaders

// Time Complexity: O(n)
// Space Complexity: O(1)

package Arrays;

import java.util.ArrayList;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        
        int max = 0;
        
        ArrayList<Integer> leaders = new ArrayList<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max <= arr[i]) {
                leaders.add(0, arr[i]);
                max = arr[i];
            }
        }
        
        return leaders;
    }
}