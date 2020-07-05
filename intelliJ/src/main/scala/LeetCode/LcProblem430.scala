package LeetCode

object LcProblem430 {
   class Node(var _value: Int) {
       var value: Int = _value
       var prev: Node = null
       var next: Node = null
       var child: Node = null
     }
  def flatten(head: Node): Node = {
    traverse(head)
    head
  }


  @scala.annotation.tailrec
  def traverse(node: Node): Unit = {
    if (node == null) {
      return
    }
    if (node.child == null) {
      traverse(node.next)
    } else {
      val a = node
      val b = node.next

      val (c, d) = flatChild(node.child)
      a.next = c
      c.prev = a

      if (d != null) {
        d.next = b
      }
      if (b != null) {
        b.prev = d
      }
      node.child = null
      traverse(b)
    }
  }

  def flatChild(node: Node): (Node, Node) = {
    val startNode = node
    var cur = node
    var endNode = node

    while (cur != null) {
      if (cur.child != null) {
        val a = cur
        val b = cur.next
        val (c, d) = flatChild(cur.child)
        a.next = c
        c.prev = a

        if (d != null) {
          d.next = b
        }

        if (b != null) {
          b.prev = d
        }
        cur.child = null
      }
      cur = cur.next
      if (cur != null) {
        endNode = cur
      }

    }
    (startNode, endNode)
  }
}
