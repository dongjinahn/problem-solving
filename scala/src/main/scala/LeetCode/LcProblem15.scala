import scala.collection.mutable.ListBuffer

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val oneSet = scala.collection.mutable.HashSet[Int]()
    val twoMap = scala.collection.mutable.SortedMap[Int, ListBuffer[List[Int]]]()
    val threeSet = scala.collection.mutable.ListBuffer[List[Int]]()

//    var i = 0
    for (num <- nums) {
      if (twoMap.isDefinedAt(-num)) { // iterate two map
        val twoSumListListBuffer = twoMap(-num)
        for (twoSumList <- twoSumListListBuffer) {
          val newThreeSetElement = (num :: twoSumList).sorted
          threeSet += newThreeSetElement
        }
      }
      for (o <- oneSet) { // iterate one set
        val newTwoSetElement = List(num, o).sorted
        val key = newTwoSetElement.sum
        if (twoMap.isDefinedAt(key)) {
          twoMap(key) += newTwoSetElement
        } else {
          twoMap(key) = ListBuffer[List[Int]](newTwoSetElement)
        }
      }

      oneSet += num
//      println(i, oneSet.size, twoMap.size)
//      i += 1
    }
    threeSet.toList
  }

}