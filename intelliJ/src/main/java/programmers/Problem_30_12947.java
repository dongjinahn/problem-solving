package programmers;

public class Problem_30_12947 {
    public boolean solution(int x) {
        return x % digitSum(x) == 0;
    }

    private int digitSum(int x) {
        int digitSum = 0;
        while (x > 0) {
            digitSum += x % 10;
            x /= 10;
        }
        return digitSum;
    }
}
