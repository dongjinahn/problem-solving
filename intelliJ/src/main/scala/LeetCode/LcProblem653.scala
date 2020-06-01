package LeetCode

object LcProblem653 {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }
  
  def findTarget(root: TreeNode, k: Int): Boolean = {
    val s = scala.collection.mutable.Set[Int]()

    var exists = false

    def traverse(node: TreeNode): Unit = {
      if (exists) {
        return
      }
      if (node == null) {
        return
      }
      if (s.contains(k - node.value)) {
        exists = true
        return
      }
      s += node.value
      traverse(node.left)
      traverse(node.right)
    }

    traverse(root)

    exists
  }

}
