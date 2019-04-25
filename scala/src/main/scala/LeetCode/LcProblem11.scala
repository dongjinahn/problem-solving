package LeetCode

object LcProblem11 extends App {
  def maxArea(heightArr: Array[Int]): Int = {
    var max = 0
    var a = 0 // start index
    var b = heightArr.length - 1 // end index
    while (a != b) {
      val heightA = heightArr(a)
      val heightB = heightArr(b)
      val area = math.min(heightA, heightB) * (b - a)
      if (area > max) {
        max = area
      }
      if (heightB > heightA) {
        a += 1
      } else {
        b -= 1
      }
    }
    max
  }

  println(maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)))
  println(maxArea(Array(1, 2, 4, 3)))
  println(maxArea(Array(1, 1)))
  println(maxArea(Array(1, 3, 2, 5, 25, 24, 5 )))
}
