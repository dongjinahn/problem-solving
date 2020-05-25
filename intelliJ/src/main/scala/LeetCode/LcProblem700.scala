package LeetCode

import scala.util.Try

object LcProblem700 extends App {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  var target: TreeNode = _

  val testNode = new TreeNode(4)
  testNode.left = new TreeNode(2)
  testNode.right = new TreeNode(7)
  testNode.left.left = new TreeNode(1)
  testNode.left.right = new TreeNode(3)

  println(searchBST(testNode, 5))


  def searchBST(root: TreeNode, value: Int): TreeNode = {
    target = null
    iterate(root, value)
    target
  }

  def iterate(node: TreeNode, value: Int): Unit = {
    if (target != null) {
      return
    }
    if (node == null) {
      return
    }
    if (node.value == value) {
      target = node
    }
    if (node.value < value) {
      iterate(node.right, value)
    }
    if (node.value > value) {
      iterate(node.left, value)
    }
  }
}
