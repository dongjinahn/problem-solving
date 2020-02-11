package programmers;

public class Problem_30_12903 {
    public String solution(String s) {
        final int l = s.length();
        if (l % 2 == 0) {
            return s.substring(l / 2 - 1, l / 2 + 1);
        }
        return s.substring(l / 2, l / 2 + 1);
    }
}
