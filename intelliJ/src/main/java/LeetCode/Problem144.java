package LeetCode;

import java.util.List;
import java.util.Vector;

public class Problem144 {
    public List<Integer> preorderTraversal(TreeNode root) {
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
        l.add(node.val);
        traverse(l, node.left);
        traverse(l, node.right);
    }
}
