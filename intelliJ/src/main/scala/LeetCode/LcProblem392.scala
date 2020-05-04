package LeetCode

object LcProblem392 {
  def isSubsequence(s: String, t: String): Boolean = {
    var answer = true
    def iterate(sl: List[Char], tl: List[Char]): Unit = {
      if (!answer) {
        return
      }
      if (sl.isEmpty) {
        return
      }
      if (tl.isEmpty) {
        answer = false
        return
      }
      if (sl.head == tl.head) {
        iterate(sl.tail, tl.tail)
      } else {
        iterate(sl, tl.tail)
      }
    }
    iterate(s.toList, t.toList)
    answer
  }
}
