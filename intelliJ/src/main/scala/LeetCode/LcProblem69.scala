package main.scala.LeetCode

object LcProblem69 extends App {
  def mySqrt(x: Int): Int = {
    var i = 1
    while (Math.pow(i, 2) <= x) {
      i += 1
    }
    i - 1
  }

  println(s"8 ${mySqrt(8)}")
}
