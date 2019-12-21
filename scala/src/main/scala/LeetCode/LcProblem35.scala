package main.scala.LeetCode

object LcProblem35 extends App {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var low = 0
    var high = nums.length - 1

    while (low <= high) {
      var mid = (low + high) / 2
      if (nums(mid) == target) {
        return mid
      } else if (nums(mid) > target) {
        high = mid - 1
      } else {
        low = mid + 1
      }
    }

    low
  }

  private def findMiddleIndexAndItem(nums: Array[Int], start: Int, end: Int): (Int, Int) = {
    val middleIndex = (end - start) / 2
    val item = nums(middleIndex)
    (middleIndex, item)
  }

  val testDataList = List(
    (Array(1, 3, 5, 6), 5),
    (Array(1, 3, 5, 6), 2),
    (Array(1, 3, 5, 6), 7),
    (Array(1, 3, 5, 6), 0)
  )

  for (testData <- testDataList) {
    val res = searchInsert(testData._1, testData._2)
    println(s"res $res")
  }

  println("hello 35")
}