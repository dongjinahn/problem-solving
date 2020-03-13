package programmers;

import java.util.Vector;

public class Problem_30_12928 {
    public int solution(int n) {
        final Vector<Integer> nums = new Vector<>(100);
        for (int i = 1; i <= n; i += 1) {
            if (n % i == 0) {
                nums.add(i);
            }
        }
        return sum(nums);
    }
    public int sum(Vector<Integer> vector) {
        int sum = 0;
        for (int i : vector) {
            sum += i;
        }
        return sum;
    }
}
