package LeetCode

import scala.collection.mutable.ArrayBuffer

object LcProblem396 extends App {
  println(maxRotateFunction(Array(4, 3, 2, 6)))

  def maxRotateFunction(A: Array[Int]): Int = {
    def f(l: Seq[Int], startIndex: Int): Int = {
      var result = 0
      var index = startIndex
      for (item <- l) {
        result += index * item
        index += 1
        index = index % A.length
      }
      println(result)
      result
    }

    var ans = 0
    for (i <- A.indices) {
      ans = ans max f(A, i)
    }
    ans
  }

}
