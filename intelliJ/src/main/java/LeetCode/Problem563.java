package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem563 {
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

    private Map<TreeNode, Integer> sumMap = new HashMap<>();
    private int findNodeSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (sumMap.containsKey(node)) {
            return sumMap.get(node);
        }
        int value = node.val + findNodeSum(node.left) + findNodeSum(node.right);
        sumMap.put(node, value);
        return value;
    }

    int tilt = 0;
    private void findNodeTilt(TreeNode node) {
        if (node == null) {
            return;
        }
        findNodeTilt(node.left);
        findNodeTilt(node.right);
        tilt += Math.abs(findNodeSum(node.left) - findNodeSum(node.right));
    }


    public int findTilt(TreeNode root) {
        findNodeTilt(root);
        return tilt;
    }
}
