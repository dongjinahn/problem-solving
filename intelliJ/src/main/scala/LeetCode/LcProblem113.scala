package LeetCode

import LeetCode.LcProblem100.TreeNode

import scala.collection.mutable

object LcProblem113 {
  def isLeaf(node: TreeNode): Boolean = {
    node != null && node.left == null && node.right == null
  }
  def pathSum(root: TreeNode, sum: Int): List[List[Int]] = {
    val res = mutable.Buffer[List[Int]]()

    def dfs(root: TreeNode, treeNodeList: List[Int]): Unit = {
      if (root == null) {
        return
      }
      val newTreeNodeList = root.value :: treeNodeList
      if (isLeaf(root) && newTreeNodeList.sum == sum) {
        res += newTreeNodeList.reverse
        return
      }

      dfs(root.left,  newTreeNodeList)
      dfs(root.right, newTreeNodeList)
    }

    dfs(root, List.empty)

    res.toList
  }

}
