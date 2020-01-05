package LeetCode;

import java.util.List;
import java.util.Vector;

public class Problem38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i += 1) {
            s = ant(s);
        }
        return s;
    }

    private static String ant(String prev) {
        final List<String> grouped = group(prev);
        final StringBuilder sb = new StringBuilder(100);
        for (String g : grouped) {
            sb.append(antify(g));
        }
        return sb.toString();
    }

    private static List<String> group(String s) {
        final List<String> l = new Vector<>();

        if (s.length() == 1) {
            l.add(s);
            return l;
        }

        StringBuilder sb = new StringBuilder();

        final char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (sb.length() == 0) {
                sb.append(ch);
            } else if (sb.charAt(0) != ch) {
                l.add(sb.toString());
                sb = new StringBuilder(String.format("%c", ch));
            } else {
                sb.append(ch);
            }
        }
        if (sb.length() != 0) {
            l.add(sb.toString());
        }

        return l;
    }

    private static String antify(String group) {
        return String.format("%d%d", group.length(), Character.getNumericValue(group.charAt(0)));
    }


}
