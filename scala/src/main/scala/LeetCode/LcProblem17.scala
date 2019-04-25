package LeetCode

object LcProblem17 extends App {
  def letterCombinations(digits: String): List[String] = {
    if (digits.length == 0) {
      return Nil
    }
    val map = Map('2' -> List('a', 'b', 'c'),
      '3' -> List('d', 'e', 'f'),
      '4' -> List('g', 'h', 'i'),
      '5' -> List('j', 'k', 'l'),
      '6' -> List('m', 'n', 'o'),
      '7' -> List('p', 'q', 'r', 's'),
      '8' -> List('t', 'u', 'v'),
      '9' -> List('w', 'x', 'y', 'z')
    )

    def solve(str: String, result: List[String]): List[String] = {
      if (str.length == 0) {
        return result
      }
      val possiblePostFixList = map(str.charAt(0))
      val nextResult = for {
        y <- possiblePostFixList
        x <- result
      } yield x ++ y.toString
      solve(str.substring(1, str.length), nextResult)
    }
    solve(digits.substring(1, digits.length), map(digits.charAt(0)).map(_.toString))
  }

  println(letterCombinations("234"))
}
