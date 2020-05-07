package LeetCode


object LcProblem559 {
  class Node(var _value: Int) {
    var value: Int = _value
    var children: List[Node] = List()
  }

  def maxDepth(root: Node): Int = {
    var max = 0
    def dfs(node: Node, depth: Int): Unit = {
      if (node == null) {
        return
      }
      val curDepth = depth + 1
      max = max max curDepth
      for (child <- node.children) {
        dfs(child, curDepth)
      }
    }
    dfs(root, 0)
    max
  }
}
