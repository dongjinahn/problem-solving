package LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Problem1302 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        Queue<TreeNode> tempQ = new LinkedList<>();
        int sum = 0;
        while (!q.isEmpty()) {
            TreeNode pop = q.poll();
            sum += pop.val;
            if (pop.left != null) {
                tempQ.add(pop.left);
            }
            if (pop.right != null) {
                tempQ.add(pop.right);
            }
            if (q.isEmpty() && tempQ.isEmpty()) { // deepest
                return sum;
            }
            if (q.isEmpty()) {
                sum = 0;
                q.addAll(tempQ);
                tempQ.clear();
            }
        }
        return -1;
    }
}
