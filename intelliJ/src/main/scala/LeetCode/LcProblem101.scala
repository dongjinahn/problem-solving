package LeetCode

import LeetCode.LcProblem1373.TreeNode

object LcProblem101 {

  def isSymmetric(root: TreeNode): Boolean = {
    if (root == null) return true

    isMirror(root.left, root.right)
  }

  def isMirror(a: TreeNode, b: TreeNode): Boolean = {
    if (a == null && b == null) return true
    if (a == null || b == null) return false

    a.value == b.value && isMirror(a.left, b.right) && isMirror(b.left, a.right)
  }
}
