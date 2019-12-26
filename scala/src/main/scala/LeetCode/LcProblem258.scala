package LeetCode

object LcProblem258 extends App {
  @scala.annotation.tailrec
  def addDigits(num: Int): Int = {
    if (num.toString.length == 1) {
      return num
    }
    addDigits(num.toString.toCharArray.map(_.toString.toInt).sum)
  }

  addDigits(38)
}
