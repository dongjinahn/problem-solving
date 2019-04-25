package LeetCode

import scala.collection.mutable

object LcProblem19 extends App {
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
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    if (head.next == null) {
      return null
    }
    val queue = mutable.Queue[ListNode]()
    var cur = head
    queue.enqueue(cur)
    var dequeued = false
    while (cur.next != null) {
      if (queue.size <= n + 1) {
        queue.enqueue(cur.next)
      }
      if (queue.size == n + 2) {
        queue.dequeue()
        dequeued = true
      }
      cur = cur.next
    }
    if (!dequeued) {
      val target = queue(queue.length - n)
      val predOfTarget = queue(queue.length - n -1)
      if (target == predOfTarget) {
        return target.next
      } else {
        predOfTarget.next = target.next
        return head
      }
    }
    val predecessor = queue.head
    predecessor.next = predecessor.next.next
    head
  }
  val a = new ListNode(1)
  a.next = new ListNode(2)
  a.next.next = new ListNode(3)
  a.next.next.next = new ListNode(4)
  a.next.next.next.next = new ListNode(5)
  removeNthFromEnd(a, 2).print()

  val b = new ListNode(1)
  b.next = new ListNode(2)
  removeNthFromEnd(b, 1).print()

  val c = new ListNode(1)
  c.next = new ListNode(2)
  removeNthFromEnd(c, 2).print()

  removeNthFromEnd(new ListNode(1), 1).print()

}
