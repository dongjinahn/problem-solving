package LeetCode;

public class Problem82 {
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
        if (head == null) {
            return null;
        }
        final ListNode dummy = new ListNode(head.val + 1, head);

        ListNode cur = dummy;
        cur.next = collapse(cur.next);

        while (cur.next != null) {
            cur = cur.next;
            cur.next = collapse(cur.next);
        }

        return dummy.next;
    }

    private ListNode collapse(ListNode node) {
        if (node == null) {
            return null;
        }
        if (node.next == null) {
            return node;
        }
        if (node.val != node.next.val) {
            return node;
        }
        ListNode cur = node;
        while (cur != null && cur.val == node.val) {
            cur = cur.next;
        }
        return collapse(cur);
    }
}
