package LeetCode;

import java.util.HashMap;

public class Problem205 {
    public boolean isIsomorphic(String s, String t) {
        return transform(s).equals(transform(t));
    }

    public String transform(String s) {
        final HashMap<Character, Character> m = new HashMap<>();
        final StringBuilder sb = new StringBuilder(s.length());
        char curChar = 'a';
        for (char ch : s.toCharArray()) {
            if (m.containsKey(ch)) {
                sb.append(m.get(ch));
            } else {
                m.put(ch, curChar);
                sb.append(curChar);
                curChar += 1;
            }
        }
        return sb.toString();
    }
}
