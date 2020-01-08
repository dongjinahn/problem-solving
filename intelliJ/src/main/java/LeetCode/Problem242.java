package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem242 {
    public boolean isAnagram(String s, String t) {
        return getCharCountMap(s).equals(getCharCountMap(t));
    }

    private Map<Character, Integer> getCharCountMap(String s) {
        final Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                final int prevCount = map.get(ch);
                map.put(ch, prevCount + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
