package LeetCode

import LeetCode.LcProblem100.TreeNode

object LcProblem124 extends App {
  println(maxPathSum(new TreeNode(-3)))

  def maxPathSum(root: TreeNode): Int = {
    var MAX = Int.MinValue.toLong

    def dfs(root: TreeNode): Long = {
      if (root == null) {
        return Int.MinValue
      }
      val leftMax = dfs(root.left)
      val rightMax = dfs(root.right)
      val newMax = leftMax + root.value max rightMax + root.value max root.value
      MAX = MAX max newMax max leftMax + rightMax + root.value
      newMax
    }
    dfs(root)
    MAX.toInt
  }
}
