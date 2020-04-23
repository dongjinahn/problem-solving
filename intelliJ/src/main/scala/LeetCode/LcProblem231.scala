package LeetCode

import scala.util.Try

object LcProblem231 {
  def isPowerOfTwo(n: Int): Boolean = {
    if (n <= 0) {
      return false
    }
    n.toBinaryString.toCharArray.groupBy(identity).mapValues(_.length)('1') == 1
  }
}
