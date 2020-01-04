package LeetCode;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

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
