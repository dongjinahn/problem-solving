package programmers;

public class Problem_30_12922 {
    public String solution(int n) {
        final StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i += 1) {
            sb.append("수박");
        }
        if (n % 2 == 1) {
            sb.append("수");
        }
        return sb.toString();
    }
}
