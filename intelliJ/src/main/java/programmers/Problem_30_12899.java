package programmers;

public class Problem_30_12899 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(String.format("i %d, solution %s", i, solution(i)));
        }

    }

    public static String solution(int n) {
        final StringBuilder sb = new StringBuilder();
        while (n > 0) {
            final int m = n % 3;
            if (m == 0) {
                sb.insert(0, 4);
                n = (n / 3) - 1;
            } else {
                sb.insert(0, m);
                n = n / 3;
            }
        }
        return sb.toString();
    }
}
