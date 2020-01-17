package LeetCode;

public class Problem606 {
    public static String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return String.valueOf(t.val);
        }
        if (t.left == null) {
            return String.format("%d()(%s)", t.val, tree2str(t.right));
        }
        if (t.right == null) {
            return String.format("%d(%s)", t.val, tree2str(t.left));
        }
        return String.format("%d(%s)(%s)", t.val, tree2str(t.left), tree2str(t.right));
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
