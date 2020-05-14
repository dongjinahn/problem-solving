package LeetCode

object LcProblem1394 {
  def findLucky(arr: Array[Int]): Int = {
    var answer = -1
    val countMap = arr.groupBy(identity).mapValues(_.length)
    for (key <- countMap.keysIterator) {
      if (key == countMap(key)) {
        answer = answer max key
      }
    }
    answer
  }
}
