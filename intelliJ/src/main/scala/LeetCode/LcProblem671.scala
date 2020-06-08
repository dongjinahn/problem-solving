package LeetCode

object LcProblem671 {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }
  def findSecondMinimumValue(root: TreeNode): Int = {
    if (root.left == null) {
      return -1
    }
    if (root.left.value == root.right.value) {
      return -1
    }

    if (root.left.value < root.right.value) {
      traverse(root.left, root.right.value)
    } else {
      traverse(root.right, root.left.value)
    }
  }

  def traverse(node: TreeNode, secondSoFar: Int): Int = {
    if (node.left == null) {
      return secondSoFar
    }
    if (node.left.value == node.right.value) {
      return traverse(node.left, secondSoFar) min traverse(node.right, secondSoFar)
    }
    if (node.left.value == node.value) {
      // right node가 더 크다는 뜻
      traverse(node.left, secondSoFar min node.right.value)
    } else {
      traverse(node.right, secondSoFar min node.left.value)
    }

  }
}
