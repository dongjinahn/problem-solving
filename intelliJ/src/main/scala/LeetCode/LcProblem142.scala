package LeetCode

import scala.util.Try

object LcProblem142 {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = _
    var x: Int = _x
  }

  def detectCycle(head: ListNode): ListNode = {
    if (head == null) {
      return null
    }
    var slow = Try(head.next).getOrElse(null)
    var fast = Try(head.next.next).getOrElse(null)
    while (slow != null && fast != null) {
      if (slow == fast) {
        return slow
      }
      slow = slow.next
      fast = fast.next.next
    }
    null
  }
}
