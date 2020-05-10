package LeetCode

import scala.collection.mutable

object LcProblem1373  extends App {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  /**
    * source: https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/discuss/531804/Bottom-up-python
    */
  def maxSumBST(root: TreeNode): Int = {
    var maximum = 0
    def dfs(node: TreeNode): (Double, Double, Int) = {
      if (node == null) {
        return (Double.PositiveInfinity, Double.NegativeInfinity, 0)
      }
      val (lmin, lmax, lsum) = dfs(node.left)
      val (rmin, rmax, rsum) = dfs(node.right)
      if (node.value > lmax && node.value < rmin) {
        maximum = maximum max node.value + lsum + rsum
        return (lmin min node.value, rmax max node.value, node.value + lsum + rsum)
      }
      (Double.NegativeInfinity, Double.PositiveInfinity, 0)
    }
    dfs(root)
    maximum
  }



  def memoize[I, O](f: I => O): I => O = new mutable.HashMap[I, O]() {
    override def apply(key: I): O = getOrElseUpdate(key, f(key))
  }

  lazy val isBST2: TreeNode => Boolean = memoize {
    case null => true
    case node if node.left == null && node.right == null =>  true
    case node if node.left == null => node.right.value > node.value && isBST2(node.right)
    case node if node.right == null => node.left.value < node.value && isBST2(node.left)
    case node => node.left.value < node.value && node.value < node.right.value && isBST2(node.left) && isBST2(node.right)
  }

  lazy val sum2: TreeNode => Int = memoize {
    case null => 0
    case node => node.value + sum2(node.left) + sum2(node.right)
  }

  def maxSumBST2(node: TreeNode): Int = {
    if (node == null) {
      return 0
    }
    if (isBST2(node)) {
      return sum2(node) max maxSumBST2(node.left) max maxSumBST2(node.right) max 0
    }
    maxSumBST2(node.left) max maxSumBST2(node.right) max 0
  }





}
