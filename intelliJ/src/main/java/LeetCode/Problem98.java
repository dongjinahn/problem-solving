package LeetCode;

public class Problem98 {
    private X traverse(TreeNode node) {
        if (node.left == null && node.right == null) {
            return new X(node.val, node.val);
        }

        if (node.left == null) {
            final X b = traverse(node.right);
            if (b == null || node.val >= b.min) {
                return null;
            }
            return new X(node.val, b.max);
        }

        if (node.right == null) {
            final X a = traverse(node.left);
            if (a == null || node.val <= a.max) {
                return null;
            }
            return new X(a.min, node.val);
        }

        final X a = traverse(node.left);
        if (a == null) {
            return null;
        }
        final X b = traverse(node.right);
        if (b == null) {
            return null;
        }
        if (a.max < node.val && node.val < b.min) {
            return new X(a.min, b.max);
        }
        return null;
    }

    private static class X {
        int min;
        int max;

        X(int _min, int _max) {
            this.min = _min;
            this.max = _max;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return traverse(root) != null;
    }
}
