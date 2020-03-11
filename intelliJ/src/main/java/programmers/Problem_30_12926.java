package programmers;

public class Problem_30_12926 {
    public String solution(String s, int n) {
        final char[] chars = s.toCharArray();
        final StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (ch == ' ') {
                sb.append(ch);
                continue;
            }
            final char shifted = (char) (ch + n);
            if (Character.isLowerCase(ch)) {
                if (shifted > 122) {
                    char c = (char) (shifted - 26);
                    sb.append(c);
                } else {
                    sb.append(shifted);
                }
            } else {
                if (shifted > 90) {
                    char c = (char) (shifted - 26);
                    sb.append(c);
                } else {
                    sb.append(shifted);
                }
            }
        }
        return sb.toString();
    }
}
