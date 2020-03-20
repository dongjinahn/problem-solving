package programmers;

public class Problem_30_12911 {
    public int solution(int n) {
        final int oneCountOfN = numOfOneInBinary(n);
        n += 1;
        while (true) {
            if (numOfOneInBinary(n) == oneCountOfN) {
                return n;
            }
            n += 1;
        }
    }

    public int numOfOneInBinary(int n) {
        int count = 0;
        for (final char ch : Integer.toBinaryString(n).toCharArray()) {
            if (ch == '1') {
                count += 1;
            }
        }
        return count;
    }
}
