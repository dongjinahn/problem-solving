package LeetCode

object LcProblem237 {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = _
    var x: Int = _x
  }

  def deleteNode(node: ListNode): Unit = {
    node.x = node.next.x
    node.next = node.next.next
  }
}
