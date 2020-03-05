package programmers;

public class Problem_30_12921 {
    public int solution(int n) {
        int count = 0;
        boolean[] isNotPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i += 1) {
            if (isNotPrime[i]) {
                continue;
            }
            if (isPrime(i)) {
                count += 1;
                for (int j = 2 * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i += 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
