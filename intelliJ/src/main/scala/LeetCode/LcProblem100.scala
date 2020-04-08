package LeetCode

object LcProblem100 {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null) {
      return true
    }
    if (p == null || q == null) { // 둘 중에 하나만 null 인 경우
      return false
    }
    if (p.value != q.value) {
      return false
    }
    isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
  }

}
