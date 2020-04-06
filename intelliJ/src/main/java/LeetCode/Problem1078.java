package LeetCode;

import java.util.Arrays;
import java.util.Vector;

public class Problem1078 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student", "a", "good")));
    }
    public static String[] findOcurrences(String text, String first, String second) {
        final String[] tokens = text.split(" ");
        final Vector<String> v = new Vector<>();
        for (int i = 1; i < tokens.length - 1; i += 1) {
            final String prev = tokens[i - 1];
            final String cur = tokens[i];
            if (prev.equals(first) && cur.equals(second)) {
                final String next = tokens[i + 1];
                v.add(next);
            }
        }

        String[] res = new String[v.size()];
        for (int i = 0; i < tokens.length; i += 1) {
            res[i] = v.get(i);
        }
        return res;
    }
}
