package LeetCode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Problem1370 {
    public static void main(String[] args) {
        System.out.println(sortString("leetcode"));
    }

    public static Map<Character, Integer> getCharCountMap(String s) {
        Map<Character, Integer> res = new TreeMap<>();
        for (char ch : s.toCharArray()) {
            if (res.containsKey(ch)) {
                res.put(ch, res.get(ch) + 1);
            } else {
                res.put(ch, 1);
            }
        }
        return res;
    }

    public static String sortString(String s) {
        final StringBuilder sb = new StringBuilder(s.length());
        int count = s.length();

        Map<Character, Integer> charCountMap = getCharCountMap(s);

        while (count != 0) {
            // increasing
            Set<Character> zeroSet = new HashSet<>();
            for (char ch : charCountMap.keySet()) {
                if (charCountMap.get(ch) == 0) {
                    zeroSet.add(ch);
                    continue;
                }
                sb.append(ch);
                count -= 1;
                charCountMap.put(ch, charCountMap.get(ch) - 1);
            }
            for (char ch : zeroSet) {
                charCountMap.remove(ch);
            }

            StringBuilder tempSb = new StringBuilder();
            // decreasing
            zeroSet = new HashSet<>();
            for (char ch : charCountMap.keySet()) {
                if (charCountMap.get(ch) == 0) {
                    zeroSet.add(ch);
                    continue;
                }
                tempSb.append(ch);
                count -= 1;
                charCountMap.put(ch, charCountMap.get(ch) - 1);
            }
            sb.append(tempSb.reverse());
            for (char ch : zeroSet) {
                charCountMap.remove(ch);
            }
        }
        return sb.toString();
    }
}
