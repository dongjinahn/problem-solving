package LeetCode;

public class Problem844 {
    public boolean backspaceCompare(String a, String b) {
        return reduceString(a).equals(reduceString(b));
    }

    private String reduceString(String s) {
        final StringBuilder sb = new StringBuilder(s.length());
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (sb.length() == 0) {
                    continue;
                }
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
