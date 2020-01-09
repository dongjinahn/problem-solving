package LeetCode;

public class Problem541 {
    public String reverseStr(String s, int k) {
        if (s.length() <= k) {
            return (new StringBuilder(s)).reverse().toString();
        }
        if (s.length() < 2 * k) {
            return (new StringBuilder(s.substring(0, k)))
                    .reverse()
                    .append(s.substring(k))
                    .toString();
        }
        return (new StringBuilder(s.substring(0, k)))
                .reverse()
                .append(s, k, 2 * k)
                .append(reverseStr(s.substring(2 * k), k))
                .toString();
    }

}
