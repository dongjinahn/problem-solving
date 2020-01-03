package LeetCode

object LcProblem2 extends App{
  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var sum = (l1.x + l2.x) % 10
    var carry =  (l1.x + l2.x) / 10

    val res = new ListNode(sum)
    var cur = res
    var a = l1.next
    var b = l2.next
    while (a != null || b != null || carry != 0) {
      sum = carry
      if (a != null) {
        sum += a.x
      }
      if (b != null) {
        sum += b.x
      }
      carry = sum / 10
      sum = sum % 10
      cur.next = new ListNode(sum)
      cur = cur.next
      if (a != null) {
        a = a.next
      }
      if (b != null) {
        b = b.next
      }
    }
    res
  }
}
