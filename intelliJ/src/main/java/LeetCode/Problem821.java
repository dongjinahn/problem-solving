package LeetCode;

import java.util.Collections;
import java.util.Vector;

public class Problem821 {
    public int[] shortestToChar(String S, char C) {
        final int[] res = new int[S.length()];
        final char[] chars = S.toCharArray();

        int i = 0;
        for (final char ch : chars) {
            if (ch == C) {
                res[i] = 0;
                i += 1;
                continue;
            }
            int j = 1;
            while (true) {
                final int leftIndex = i - j;
                final int rightIndex = i + j;
                if (leftIndex >= 0 && chars[leftIndex] == C) {
                    res[i] = j;
                    break;
                }
                if (rightIndex < S.length() && chars[rightIndex] == C) {
                    res[i] = j;
                    break;
                }
                j += 1;
            }
            i += 1;
        }
        return res;
    }
}
