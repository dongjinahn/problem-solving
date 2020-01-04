package LeetCode;

public class Problem21 {
    public static void main(String[] args) {
        final ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(4);

        final ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);

        final ListNode merged = mergeTwoLists(a, b);
        System.out.println(merged.toString());
    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        final ListNode dummy = new ListNode(-1);
        append(dummy, a, b);
        return dummy.next;
    }

    private static void append(ListNode cursor, ListNode c, ListNode d) {
        if (c == null && d == null) {
            return;
        }

        if (c == null) {
            cursor.next = d;
            append(cursor.next, c, d.next);
        } else if (d == null) {
            cursor.next = c;
            append(cursor.next, c.next, d);
        } else if (c.x < d.x) {
            cursor.next = c;
            append(cursor.next, c.next, d);
        } else {
            cursor.next = d;
            append(cursor.next, c, d.next);
        }
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
