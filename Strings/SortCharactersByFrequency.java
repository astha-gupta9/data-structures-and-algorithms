// Leetcode 451 - Sort Characters By Frequency

// Time complexity: O(nlogn)
// Space complexity: O(n)

package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        
        // frequency count of each character of string
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        // sort chars w.r.t their frequencies
        List<Map.Entry<Character, Integer>> charList = new ArrayList<>(charMap.entrySet());
        charList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Make result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charList.size(); i++) {
            
            int freq = charList.get(i).getValue();
            while (freq > 0) {
                result.append(charList.get(i).getKey());
                freq--;
            }
        }

        return result.toString();
    }
}
