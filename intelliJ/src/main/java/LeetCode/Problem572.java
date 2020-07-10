package LeetCode;

import java.util.HashMap;

public class Problem572 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.add(s);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (isEqual(cur, t)) {
                return true;
            }
            if (cur.left != null) {
                q.add(cur.left);
            }
            if (cur.right != null) {
                q.add(cur.right);
            }
        }
        return false;
    }

    private boolean isEqual(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        return s.val == t.val && isEqual(s.left, t.left) && isEqual(s.right, t.right);
    }
}
