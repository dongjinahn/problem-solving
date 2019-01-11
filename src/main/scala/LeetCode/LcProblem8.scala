package LeetCode

object LcProblem8 extends App {
  def myAtoi(str: String): Int = {
    if (str.length > 2 && str.substring(0, 2) == "+-") {
      return 0
    }
    val trimmed = str.trim.replaceFirst("^\\+", "")
    if (trimmed.length == 0 || trimmed == "-") {
      return 0
    }
//    println(s"trimmed $trimmed")
    val stringType = if (trimmed(0) == '-' && trimmed(1).isDigit) {
      0 // negative integer
    } else if (trimmed(0).isDigit) {
      1 // positive integer
    } else {
      -1 // error
    }

    if (stringType == -1) {
      return 0
    }

    val withoutSign = trimmed.replaceFirst("^-", "")
//    println(s"withoutSign $withoutSign")
    val lastIndex = withoutSign.indexWhere(ch => !ch.isDigit)
    val digitOnly = if (lastIndex == -1 ) withoutSign else withoutSign.substring(0, lastIndex)
    val finalStr = if (stringType == 0) {
      "-" ++ digitOnly
    } else {
      digitOnly
    }
//    println(s"final str $finalStr")
    val res = scala.util.Try[Int](finalStr.toDouble.toInt)
    res.getOrElse(if (stringType == 0) Int.MinValue else Int.MaxValue)
  }

  println(myAtoi("     -42"))
  println(myAtoi("4193 with words"))
  println(myAtoi("words and 987"))
  println(myAtoi("-91293482332"))
  println(myAtoi("3.14159"))
  println(myAtoi("+1"))
  println(myAtoi("-0012a42"))
}
