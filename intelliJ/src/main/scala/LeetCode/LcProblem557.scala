package LeetCode

object LcProblem557 {
  def reverseWords(s: String): String = {
    s.split(" ").map(_.reverse).mkString(" ")
  }
}
