package LeetCode

import scala.util.Try

object LcProblem141 {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = _
    var x: Int = _x
  }

  def hasCycle(head: ListNode): Boolean = {
    var sPointer = Try(head.next).getOrElse(null)
    var fPointer = Try(head.next.next).getOrElse(null)

    while (sPointer != null && fPointer != null) {
      if (sPointer == fPointer) {
        return true
      }
      sPointer = Try(sPointer.next).getOrElse(null)
      fPointer = Try(fPointer.next.next).getOrElse(null)
    }
    false
  }
}
