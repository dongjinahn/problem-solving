package LeetCode;

public class Problem83 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(50);
            ListNode cur = this;
            sb.append(this.val);
            while (cur.next != null) {
                sb.append("->");
                sb.append(cur.next.val);
                cur = cur.next;
            }
            return sb.toString();
        }
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        traverse(head);
        return head;
    }

    public void traverse(ListNode node) {
        if (node == null) {
            return;
        }
        if (node.next == null) {
            return;
        }
        while (node.next.val == node.val) {
            node.next = node.next.next;
            if (node.next == null) {
                break;
            }
        }
        traverse(node.next);
    }
}
