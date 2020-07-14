package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem590 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    // recursion
    private List<Integer> l = new LinkedList<>();
    private void traverse(Node node) {
        if (node == null) {
            return;
        }
        if (node.children != null) {
            for (final Node child : node.children) {
                traverse(child);
            }
        }
        visit(node);
    }
    private void visit(Node node) {
        this.l.add(node.val);
    }
    public List<Integer> postorder(Node root) {
        traverse(root);
        return this.l;
    }
}
