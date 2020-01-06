package LeetCode;

public class Problem206 {
    public static void main(String[] args) {
        final ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);

        System.out.println(reverseList(a).toString());

    }
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        final ListNode dummy = new ListNode(-1);

        ListNode before = null;
        ListNode cur = head;
        do {
            final ListNode next = cur.next; // 2, 3, null
            cur.next = before; // null, 1, 2
            before = cur; // 1, 2, 3
            cur = next; // 2, 3, null
        } while (cur != null);

        dummy.next = before;

        return dummy.next;
    }

    private static class ListNode {
        int x;
        ListNode next;
        ListNode(int _x) { x = _x; }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(50);
            ListNode cur = this;
            sb.append(this.x);
            while (cur.next != null) {
                sb.append("->");
                sb.append(cur.next.x);
                cur = cur.next;
            }
            return sb.toString();
        }
    }
}
