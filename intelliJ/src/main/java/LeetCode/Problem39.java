package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Problem39 {
    private void search(int[] c, int i, int sum, int target, List<Integer> curList, List<List<Integer>> resList) {
        if (sum > target) {
            return;
        }

        if (sum == target) {
            resList.add(curList);
        }

        int k = i;
        while (k < c.length) {
            List<Integer> nextList = new Vector<>(curList);
            nextList.add(c[k]);
            search(c, k, sum + c[k], target, nextList, resList);
            k += 1;
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new Vector<>();
        search(candidates, 0, 0, target, new Vector<>(), resList);
        return resList;
    }
}
