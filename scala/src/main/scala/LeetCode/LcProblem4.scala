package LeetCode

import scala.util.Try

object LcProblem4 extends App {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val queue = new scala.collection.mutable.Queue[Int]()
    val totalLength = nums1.length + nums2.length
    val isOverallEven = totalLength % 2 == 0

    var i = 0
    var j = 0
    while (queue.length != (totalLength / 2)) {
      if (!nums1.isDefinedAt(i)) {
        queue.enqueue(nums2(j))
        j += 1
      } else if (!nums2.isDefinedAt(j)) {
        queue.enqueue(nums1(i))
        i += 1
      } else if (nums1(i) >= nums2(j)) {
        queue.enqueue(nums2(j))
        j += 1
      } else {
        queue.enqueue(nums1(i))
        i += 1
      }
    }

    if (isOverallEven) {
      val a = Try[Int](nums1(i)).getOrElse(Int.MaxValue)
      val b = Try[Int](nums2(j)).getOrElse(Int.MaxValue)
      val rightMedian = math.min(a, b)
      (queue.last + rightMedian).toDouble / 2
    } else {
      val a = Try[Int](nums1(i)).getOrElse(Int.MaxValue)
      val b = Try[Int](nums2(j)).getOrElse(Int.MaxValue)
      math.min(a, b)
    }
  }

  val a = findMedianSortedArrays(Array(1), Array(2, 3))
  println(s"a $a")
  val b = findMedianSortedArrays(Array(1, 2), Array(3))
  println(s"b $b")
}
