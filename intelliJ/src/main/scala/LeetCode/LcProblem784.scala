package LeetCode

object LcProblem784 extends App {
  def letterCasePermutation(S: String): List[String] = {
    iterate(S, List(""))
  }

  def iterate(s: String, res: List[String]): List[String] = {
    if (s.length == 0) {
      return res
    }
    val ch = s.charAt(0)
    if (Character.isAlphabetic(ch)) {
      val u = Character.toUpperCase(ch)
      val l = Character.toLowerCase(ch)
      iterate(s.substring(1), res.map(x => s"${x}${u}")  ++ res.map(x => s"${x}${l}"))
    } else {
      iterate(s.substring(1), res.map(x => s"${x}${ch}"))
    }
  }
}
