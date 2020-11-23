package LeetCode;

import java.util.List;
import java.util.Vector;

public class Problem94 {
    public static class TreeNode {
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


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new Vector<>();
        traverse(l, root);
        return l;
    }

    private void traverse(List<Integer> l, TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            l.add(node.val);
            return;
        }
        traverse(l, node.left);
        l.add(node.val);
        traverse(l, node.right);
    }
}
