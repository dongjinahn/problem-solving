package LeetCode;

public class Problem598 {
    public int maxCount(int m, int n, int[][] ops) {
        int a = m;
        int b = n;
        for (final int[] op : ops) {
            a = Math.min(a, op[0]);
            b = Math.min(b, op[1]);
        }
        return a * b;
    }
}
