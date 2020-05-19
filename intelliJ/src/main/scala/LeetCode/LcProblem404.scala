package LeetCode

import scala.util.Try

object LcProblem404 {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  def sumOfLeftLeaves(root: TreeNode): Int = {
    iterate(root)
  }

  def isLeave(node: TreeNode): Boolean = {
    if (node == null) {
      false
    } else {
      node.left == null && node.right == null
    }
  }

  def iterate(node: TreeNode): Int = {
    if (node == null) {
      0
    } else {
      if (isLeave(node.left)) {
        node.left.value + iterate(node.right)
      } else {
        iterate(node.left) + iterate(node.right)
      }
    }
  }

}
