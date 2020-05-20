package LeetCode

import scala.collection.mutable

object LcProblem509 {
  val memo = new mutable.HashMap[Int, Int]()
  memo.put(0, 0)
  memo.put(1, 1)

  def fib(n: Int): Int = {
    if (memo.contains(n)) {
      memo(n)
    } else {
      val v = fib(n - 1) + fib(n - 2)
      memo.put(n, v)
      v
    }
  }
}
