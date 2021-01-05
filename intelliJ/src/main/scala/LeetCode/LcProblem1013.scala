package LeetCode

object LcProblem1013 {
  def canThreePartsEqualSum(arr: Array[Int]): Boolean = {
    val sum = arr.sum
    if (sum % 3 != 0) {
      return false
    }
    val avg = sum / 3

    var partCount = 0
    var s = 0
    for (x <- arr) {
      s += x
      if (s == avg) {
        partCount += 1
        s = 0
      }
    }

    if (partCount < 3) {
      return false
    }
    if (avg == 0 && partCount >= 3) {
      return true
    }
    partCount % 3 == 0
  }
}
