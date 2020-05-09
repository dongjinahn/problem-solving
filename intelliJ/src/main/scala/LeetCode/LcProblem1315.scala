package LeetCode

import LeetCode.LcProblem100.TreeNode

object LcProblem1315 {
  def sumEvenGrandparent(root: TreeNode): Int = {
    var sum = 0;
    def dfs(node: TreeNode, gpValue: Int, pValue: Int): Unit = {
      if (node == null) {
        return
      }
      if (gpValue % 2 == 0) {
        sum += node.value
      }
      dfs(node.left, pValue, node.value)
      dfs(node.right, pValue, node.value)
    }
    dfs(root, -1, -1)
    sum
  }
}
