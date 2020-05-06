package LeetCode

import scala.collection.mutable

object LcProblem1137 {
  val memo = Array.fill(38)(-1)
  memo(0) = 0
  memo(1) = 1
  memo(2) = 1
  def tribonacci(n: Int): Int = {
    if (memo(n) != -1) {
      memo(n)
    } else {
      val t = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3)
      memo(n) = t
      t
    }
  }

}
