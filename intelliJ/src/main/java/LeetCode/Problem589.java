package LeetCode;

import java.util.*;

public class Problem589 {
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

    // iteration
//    public List<Integer> preorder(Node root) {
//        List<Integer> ans = new Vector<>();
//
//        final Stack<Node> s = new Stack<>();
//
//        s.add(root);
//        while (!s.isEmpty()) {
//            Node cur = s.pop();
//            ans.add(cur.val);
//
//            if (cur.children != null) {
//                final Vector<Node> temp = new Vector<>(cur.children);
//                Collections.reverse(temp);
//                s.addAll(temp);
//            }
//        }
//        return ans;
//    }

    // recursion
    public List<Integer> preorder(Node root) {
        return traverse(root, new LinkedList<>());
    }

    private List<Integer> traverse(Node node, List<Integer> l) {
        if (node == null) {
            return l;
        }
        l.add(node.val);
        if (node.children == null) {
            return l;
        }
        for (Node child : node.children) {
            l = traverse(child, l);
        }
        return l;
    }
}
