package LeetCode

import LeetCode.LcProblem100.TreeNode

object LcProblem104 {
  def maxDepth(root: TreeNode): Int = {
    var max = 0
    def dfs(node: TreeNode, depth: Int): Unit = {
      if (node == null) {
        return
      }
      val curDepth = depth + 1
      max = max max curDepth
      dfs(node.left, curDepth)
      dfs(node.right, curDepth)
    }
    dfs(root, 0)
    max
  }
}
