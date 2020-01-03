package LeetCode

import scala.collection.mutable


object LcProblem39 {
  private def search(c: Array[Int], i: Int, sum: Int, target: Int, curList: List[Int], resList: mutable.Buffer[List[Int]]): Unit = {
    if (sum > target) {
      return
    }
    if (sum == target) {
      resList += curList
      return
    }
    var k = i
    while (k < c.length) {
      val nextList = curList :+ c(k)
      search(c, k , sum + c(k), target, nextList, resList)
      k += 1
    }
  }
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
    val resList = mutable.Buffer[List[Int]]()
    search(candidates, 0, 0, target, List.empty, resList)
    resList.toList
  }
}