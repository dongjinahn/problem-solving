package LeetCode

object LcProblem20 extends App {
  def isValid(s: String): Boolean = {
    val stack = scala.collection.mutable.Stack[Char]()
    def isStart(ch: Char): Boolean = {
      "[{(".contains(ch)
    }
    def getMatch(ch: Char): Char = {
      ch match {
        case ']' => '['
        case '}' => '{'
        case ')' => '('
      }
    }

    var isValid = true
    var i = 0
    while (isValid && i < s.length) {
      val ch = s(i)
      if (isStart(ch)) {
        stack.push(ch)
      } else {
        // end paren
        if (stack.isEmpty) {
          isValid = false
        } else if (stack.top == getMatch(ch)) {
          stack.pop()
        } else {
          isValid = false
        }
      }
      i += 1
    }
    if (stack.isEmpty) isValid else false
  }

  println(isValid("()"))
  println(isValid("()[]{}"))
  println(isValid("(]"))
  println(isValid("([)]"))
  println(isValid("{[]}"))
  println(isValid("}"))
  println(isValid("["))
}
