package LeetCode

import scala.collection.mutable

object LcProblem217 {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    val s = mutable.HashSet[Int]()
    for (num <- nums) {
      if (s.contains(num)) {
        return true
      }
      s += num
    }
    false
  }
}
