package LeetCode

object LcProblem26 extends App {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length == 0) {
      return 0
    }
    var nextOverwriteIndex = 1
    var min = nums(0)
    for (num <- nums) {
      if (num > min) {
        nums(nextOverwriteIndex) = num
        nextOverwriteIndex += 1
        min = num
      }
    }
    nextOverwriteIndex
  }

  def run(nums: Array[Int]): Unit = {
    val len = removeDuplicates(nums)
    val str = nums.splitAt(len)._1.mkString(",")
    println(str)
  }

  run(Array())
  run(Array(1, 1, 2))
  run(Array(0,0,1,1,1,2,2,3,3,4))
}
