package LeetCode

import LeetCode.LcProblem100.TreeNode

object LcProblem112 {

  def isLeaf(node: TreeNode): Boolean = {
    node != null && node.left == null && node.right == null
  }
  def hasPathSum(root: TreeNode, sum: Int): Boolean = {
    if (root == null) {
      return false
    }
    if (isLeaf(root)) {
      return root.value - sum == 0
    }

    hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value)
  }
}
