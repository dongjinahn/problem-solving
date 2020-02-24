package programmers.skillcheck2;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    public int solution(int[] nums) {
        final Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        }
        return Math.min(nums.length / 2, s.size());
    }
}
