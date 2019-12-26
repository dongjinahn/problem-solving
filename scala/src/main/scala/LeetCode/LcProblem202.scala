package LeetCode

import scala.collection.mutable

object LcProblem202 extends App {
  @scala.annotation.tailrec
  def loop(n: Int, s: mutable.Set[Set[Int]]): Boolean = {
    if (n == 1) {
      return true
    }
    val intArr = n.toString.split("").map(_.toInt)
    if (s contains intArr.toSet) {
      return false
    }
    s += intArr.toSet
    val sum = intArr.map(Math.pow(_, 2)).sum.toInt
    loop(sum, s)
  }

  def isHappy(n: Int): Boolean = {
    loop(n, mutable.Set.empty)
  }

  println(s"isHappy ${isHappy(19)}")
}
