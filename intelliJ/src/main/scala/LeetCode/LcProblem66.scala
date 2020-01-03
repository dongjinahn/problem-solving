package LeetCode

import scala.collection.mutable

object LcProblem66 extends App {

  def plusOne(digits: Array[Int]): Array[Int] = {
    var res = List[Int]()
    // Do while
    val lastDigit = digits(digits.length - 1)
    var hasCarry = lastDigit == 9
    if (hasCarry) {
      res = 0 :: res
    } else {
      res = (lastDigit + 1) :: res
    }
    // 아랫자리수부터 순회
    for (i <- digits.length - 2 to (0, -1)) {
      val digit = digits(i)
      if (hasCarry && digit == 9) {
        res = 0 :: res
      } else if (hasCarry) {
        res = digit + 1 :: res
        hasCarry = false
      } else {
        res = digit :: res
        hasCarry = false
      }
    }

    if (hasCarry) {
      res = 1 :: res
    }
    res.toArray
  }

//  println(s"plusOne2 ${plusOne(Array(9, 8, 7, 6, 5, 4, 3, 2, 1)).mkString(",")}")
  println(s"plusOne2 ${plusOne(Array(1, 2, 3)).mkString(",")}")
  println(s"plusOne2 ${plusOne(Array(9)).mkString(",")}")
}
