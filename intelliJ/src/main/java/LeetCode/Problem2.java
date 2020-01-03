package LeetCode;

public class Problem2 {
    public static void main(String[] args) {
        final ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);

        final ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);

        final ListNode c = new ListNode(9);
        c.next = new ListNode(8);

        final ListNode d = new ListNode(1);

        System.out.println("c + d " + addTwoNumbers(c, d).toString());
    }

    public static ListNode addTwoNumbers(ListNode a, ListNode b) {
        int hasCarry = 0;
        final ListNode dummy = new ListNode(-1); // return할 때 도움되는 dummy. dummy의 다음부터 정답을 저장할 것이다.
        ListNode cur = dummy;
        while (true) {
            final int aVal = a == null ? 0 : a.val;
            final int bVal = b == null ? 0 : b.val;
            final int addRes = aVal + bVal + hasCarry;
            hasCarry = addRes / 10;
            cur.next = new ListNode(addRes % 10);

            if (a == null && b == null) {
                if (cur.next.val == 0) { // 마지막 숫자가 0이면 없애야함 89 + 1의 결과가 0->9->0 나오는 케이스 제외
                    cur.next = null;
                }
                break;
            }
            // for에서 i += 1 같은 부분
            cur = cur.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
        if (hasCarry == 1) {
            // 다 돌았는데 hasCarry에 찌꺼기 남아있는 경우. 5+5로 잡음
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }

    public static class ListNode {
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
}
