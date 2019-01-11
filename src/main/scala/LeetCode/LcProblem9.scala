package LeetCode

object LcProblem9 extends App {
  def isPalindrome(x: Int): Boolean = { // 560ms
    if (x < 0) {
      false
    } else if (x < 10) {
      true
    } else {
      val strLen = math.log10(x).ceil.toInt
      var reverse = 0
      var i = 0
      var newX = x
      while (i < strLen / 2) {
        val temp = newX % 10
        newX /= 10
        reverse = reverse * 10 + temp
        i += 1
      }
      if (strLen % 2 != 0) {
        newX /= 10
      }
      newX == reverse
    }
  }

  def isPalindrome2(x: Int): Boolean = { // 592ms
    if (x < 0) {
      false
    } else if (x < 10) {
      true
    } else {
      val str = x.toString
      str == str.reverse
    }
  }

  println(isPalindrome(1001))
}
