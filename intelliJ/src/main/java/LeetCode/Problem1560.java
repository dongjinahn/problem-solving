package LeetCode;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Problem1560 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        final Vector<Integer> res = new Vector<>();
        final int start = rounds[0];
        final int end = rounds[rounds.length - 1];
        res.add(start);

        int cur = start;
        while (cur != end){
            cur += 1;
            cur %= n + 1;
            if (cur == 0) {
                continue;
            }
            res.add(cur);
        }
        Collections.sort(res);
        return res;
    }
}
