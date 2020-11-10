package LeetCode;

import java.util.HashSet;

public class Problem41 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{2147483647}));
    }

    public static int firstMissingPositive(int[] nums) {
        final HashSet<Long> memo = new HashSet<>();
        long biggest = Integer.MIN_VALUE;
        for (final int n : nums) {
            if (n <= 0) {
                continue;
            }
            memo.add((long) n);
            if (n > biggest) {
                biggest = n;
            }
        }

        if (memo.isEmpty()) {
            return 1;
        }
        for (long i = 1; i <= biggest + 1L; i += 1) {
            System.out.println(String.format("i %d", i));
            if (!memo.contains(i)) {
                return (int) i;
            }
        }
        return -1;
    }
}
