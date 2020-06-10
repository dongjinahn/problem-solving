package LeetCode

object LcProblem226 {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) {
      return null
    }
    val temp = root.left
    root.left = root.right
    root.right = temp

    if (root.left != null) {
      invertTree(root.left)
    }
    if (root.right != null) {
      invertTree(root.right)
    }
    root
  }
}
