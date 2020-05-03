package LeetCode

import LeetCode.LcProblem100.TreeNode

object LcProblem1022 {
  def isLeaf(node: TreeNode): Boolean = {
    node != null && node.left == null && node.right == null
  }

  def sumRootToLeaf(root: TreeNode): Int = {
    var answer = 0
    def dfs(node: TreeNode, binaryStr: String): Unit = {
      if (node == null) {
        return
      }
      if (isLeaf(node)) {
        answer += Integer.parseInt(binaryStr + node.value, 2)
        return
      }
      dfs(node.left, binaryStr + node.value)
      dfs(node.right, binaryStr + node.value)
    }
    dfs(root, "")
    answer
  }
}
