package LeetCode

import scala.collection.mutable

object LcProblem118 {
  def generate(numRows: Int): List[List[Int]] = {
    if (numRows == 0) {
      return List.empty
    }
    if (numRows == 1) {
      return List(List(1))
    }

    val res = mutable.Buffer[List[Int]]()
    res += List(1)
    res += List(1, 1)

    var i = numRows - 2
    while (i > 0) {
      res += next(res.last)
      i -= 1
    }

    res.toList
  }
  def next(l: List[Int]): List[Int] = {
    val r = Array.fill[Int](l.length + 1)(1)
    r(0) = 1
    r(r.length - 1) = 1
    for (i <- 0 to l.length - 2) {
      r(i + 1) = l(i) + l(i + 1)
    }
    r.toList
  }
}
