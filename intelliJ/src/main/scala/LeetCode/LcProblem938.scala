package LeetCode

object LcProblem938 extends App {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  def rangeSumBST(node: TreeNode, L: Int, R: Int): Int = {
    if (node == null) {
      return 0
    }
    if (node.value < L) {
      return rangeSumBST(node.right, L, R)
    }
    if (node.value > R) {
      return rangeSumBST(node.left, L, R)
    }

    node.value + rangeSumBST(node.left, L, R) + rangeSumBST(node.right, L, R)
  }
}
