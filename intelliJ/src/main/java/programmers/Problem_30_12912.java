package programmers;

public class Problem_30_12912 {
    public long solution(int a, int b) {
        return a < b ? mySolution(a, b) : mySolution(b, a);
    }

    private long mySolution(int startNumber, int endNumber) {
        long sum = 0;
        for (int i = startNumber; i <= endNumber; i += 1) {
            sum += i;
        }
        return sum;
    }
}
