package LeetCode

object LcProblem24 extends App {
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

  /**
    * [prev] => [target (= a)] => [target.next (= b)]
    */
  def swap(prev: ListNode, target: ListNode): Unit = {
    val a = target
    if (a == null) {
      return
    }
    val b = target.next
    if (b == null) {
      return
    }
    a.next = b.next
    prev.next = b
    b.next = a
  }

  def swapPairs(head: ListNode): ListNode = {
    val dummy = new ListNode(0)
    dummy.next = head
    var cur = dummy

    var i = 0
    while (cur.next != null) {
      if (i % 2 == 0) {
        swap(cur, cur.next)
      }
      cur = cur.next
      i += 1
    }
    dummy.next
  }

  val a = new ListNode(1)
  a.next = new ListNode(2)
  a.next.next = new ListNode(3)
  a.next.next.next = new ListNode(4)
  a.next.next.next.next = new ListNode(5)
  a.next.next.next.next.next = new ListNode(6)

  print("merged: ")
  swapPairs(a).print()
}
