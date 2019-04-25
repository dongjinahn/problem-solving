package LeetCode

object LcProblem23 extends App {
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

  def mergeKLists(lists: Array[ListNode]): ListNode = {
    val k = lists.length
    val dummy = new ListNode(0)
    var cur = dummy

    case class ListNodeWrapper(node: ListNode, index: Int)

    // https://stackoverflow.com/questions/27119557/what-is-the-easiest-and-most-efficient-way-to-make-a-min-heap-in-scala
    object MinOrder extends Ordering[ListNodeWrapper] {
      override def compare(x: ListNodeWrapper, y: ListNodeWrapper): Int = y.node.x compare x.node.x
    }

    val minHeap = scala.collection.mutable.PriorityQueue.empty(MinOrder)
    val headList = new Array[ListNode](k)
    for (i <- 0 until k) {
      var head = lists(i)
      minHeap += ListNodeWrapper(head, i) // push head
      head = head.next
      headList(i) = head // tail
    }

    while (minHeap.nonEmpty) {
      val currentMinWrapper = minHeap.dequeue()
      cur.next = currentMinWrapper.node
      cur = cur.next
      val removedListIndex = currentMinWrapper.index
      val removedListHead = headList(removedListIndex)
      if (removedListHead != null) {
        minHeap += ListNodeWrapper(removedListHead, removedListIndex)
        headList(removedListIndex) = headList(removedListIndex).next
      }
    }
    dummy.next
  }
  val a = new ListNode(1)
  a.next = new ListNode(4)
  a.next.next = new ListNode(5)
  a.print()
  val b = new ListNode(1)
  b.next = new ListNode(3)
  b.next.next = new ListNode(4)
  b.print()
  val c = new ListNode(2)
  c.next = new ListNode(6)
  c.print()

  print("merged: ")
  mergeKLists(Array(a, b, c)).print()
}
