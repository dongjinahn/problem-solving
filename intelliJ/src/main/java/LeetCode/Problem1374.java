package LeetCode;

public class Problem1374 {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder(n);
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i += 1) {
                sb.append('x');
            }
            sb.append('y');
        } else {
            for (int i = 0; i < n; i += 1) {
                sb.append('x');
            }
        }
        return sb.toString();
    }
}
