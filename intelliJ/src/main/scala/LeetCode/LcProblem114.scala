package LeetCode

import LeetCode.LcProblem1373.TreeNode

object LcProblem114 {
  def flatten(root: TreeNode): Unit = {
    if (root != null) {
      flat(root)
    }
  }

  /**
    * @param node
    * @return _1: startNode, _2: endNode
    */
  def flat(node: TreeNode): (TreeNode, TreeNode) = {
    var endNode = node
    val right = node.right

    if (node.left != null) {
      val (flatLeftStart, flatLeftEnd) = flat(node.left)
      endNode = flatLeftEnd
      node.right = flatLeftStart
      node.left = null
    }
    if (right != null) {
      val (flatRightStart, flatRightEnd) = flat(right)
      endNode.right = flatRightStart
      endNode = flatRightEnd
    }
    (node, endNode)
  }
}
