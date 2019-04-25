package LeetCode

object LcProblem1 extends App {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var m = Map[Int, Int]()
    var index = 0;
    for (value <- nums) {
      val complement = target - value

      if (m.isDefinedAt(complement)) {
        return Array(m(complement), index)
      } else {
        m += (value -> index)
      }
      index += 1
    }
    Array(-1, -1)

  }
  println(twoSum(Array(2, 7, 11, 15), 9).mkString(","))
}
