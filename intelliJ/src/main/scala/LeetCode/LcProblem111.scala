package LeetCode

import LeetCode.LcProblem100.TreeNode

object LcProblem111 {
  def isLeaf(node: TreeNode): Boolean = {
    node != null && node.left == null && node.right == null
  }

  def minDepth(root: TreeNode): Int = {
    if (root == null) {
      return 0
    }
    var min = Int.MaxValue
    def dfs(node: TreeNode, depth: Int): Unit = {
      if (node == null) {
        return
      }
      val curDepth = depth + 1
      if (isLeaf(node)) {
        min = min min curDepth
      } else {
        dfs(node.left, curDepth)
        dfs(node.right, curDepth)
      }
    }
    dfs(root, 0)
    min
  }
}
