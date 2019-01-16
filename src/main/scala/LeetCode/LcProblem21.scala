package LeetCode

object LcProblem21 extends App {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
    def print(): Unit = {
      val sb = new StringBuilder
      sb.append(this.x)
      var cur = this
      while (cur.next != null) {
        sb.append(s"->${cur.next.x}")
        cur = cur.next
      }
      println(sb.mkString)
    }
  }

  def mergeTwoLists(a: ListNode, b: ListNode): ListNode = {
    val dummy = new ListNode(0)

    def append(cursor: ListNode, c: ListNode, d: ListNode): Unit = {
      if (c == null && d == null) {
        return
      }
      if (c == null) {
        cursor.next = d
        append(cursor.next, c, d.next)
      } else if (d == null) {
        cursor.next = c
        append(cursor.next, c.next, d)
      } else if (c.x < d.x) {
        cursor.next = c
        append(cursor.next, c.next, d)
      } else {
        cursor.next = d
        append(cursor.next, c, d.next)
      }
    }
    append(dummy, a, b)
    dummy.next
  }
  val a = new ListNode(1)
  a.next = new ListNode(2)
  a.next.next = new ListNode(3)
  a.print()
  val b = new ListNode(1)
  b.next = new ListNode(3)
  b.next.next = new ListNode(4)
  b.print()

  mergeTwoLists(a, b).print()
}
