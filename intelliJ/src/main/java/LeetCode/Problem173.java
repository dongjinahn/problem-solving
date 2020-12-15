package LeetCode;

import java.util.Stack;

public class Problem173 {
    private Stack<TreeNode> s = new Stack<>();

    public Problem173(TreeNode root) {
        push(root);
    }

    private void push(TreeNode node) {
        TreeNode cur = node;
        while (cur != null) {
            s.push(cur);
            cur = cur.left;
        }
    }
    /** @return the next smallest number */
    public int next() {
        TreeNode popped = s.pop();
        if (popped.right != null) {
            push(popped.right);
        }
        return popped.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.empty();
    }
}
