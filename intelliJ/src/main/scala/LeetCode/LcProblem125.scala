package LeetCode

object LcProblem125 {
  def isPalindrome(s: String): Boolean = {
    val a = s.toLowerCase.replaceAll("_", "").replaceAll("\\W", "")
    a == a.reverse
  }
}
