// Leetcode 451 - Sort Characters By Frequency

package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    
    // Time complexity: O(nlogn)
    // Space complexity: O(n)
    public String comparisonSort(String s) {
        
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

    // Time complexity: O(n)
    // Space complexity: O(n)
    public String frequencySort(String s) {

        // Bucket Sort

        // count frequency of each char of string
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        // bucket chars with same frequency
        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for (Map.Entry<Character, Integer> e : charMap.entrySet()) {
            int freq = e.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<Character>();
            }
            bucket[freq].add(e.getKey());
        }

        // generate result string
        StringBuilder result = new StringBuilder();
        for (int i = bucket.length - 1; i > 0; i--) {

            if (bucket[i] == null)
                continue;

            // traverse bucket for current frequency
            for (char ch : bucket[i]) {

                // append each char i number of times in result string
                for (int j = 0; j < i; j++) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
