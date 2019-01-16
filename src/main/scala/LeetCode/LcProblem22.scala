package LeetCode

object LcProblem22 extends App {
  case class MyParen(str: String, openCount: Int) { // count: opening paren count in this.str
    def closeCount(): Int = {
      this.str.length - this.openCount
    }
    def closable(): Boolean = this.openCount > this.closeCount
    def openable(pairCount: Int): Boolean = pairCount > this.openCount
    override def toString = this.str
  }

  def generateParenthesis(n: Int): List[String] = {
    def solve(m: Int, set: Set[MyParen]): Set[MyParen] = {
      if (set.head.str.length == n * 2) {
        return set
      }
//      println(s"set ${set.mkString(",")} ${set.size}")
      var nextSet = Set[MyParen]()
      for (paren <- set) {
        if (paren.openable(n)) { //
          nextSet = nextSet + MyParen(paren.str ++ "(", paren.openCount + 1)
        }
        if (paren.closable()) {
          nextSet = nextSet + MyParen(paren.str ++ ")", paren.openCount)
        }
      }
      solve(m, nextSet)
    }

    solve(n, Set(MyParen("(", 1))).toList.map(_.str)
  }

  val i = 10
  println(s"# pair: $i")
  for (x <- generateParenthesis(i)) {
    println(x)
  }
//  println(generateParenthesis(2).mkString(","))
}
