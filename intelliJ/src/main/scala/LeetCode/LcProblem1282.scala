package LeetCode

import scala.collection.mutable

object LcProblem1282 extends App {
  groupThePeople(Array(3, 3, 3, 3, 3, 1, 3))

  def groupThePeople(groupSizes: Array[Int]): List[List[Int]] = {
    val sizeIndexMap = mutable.HashMap[Int, mutable.Queue[Int]]()
    for ((groupSize, index) <- groupSizes.zipWithIndex) {
      if (sizeIndexMap.contains(groupSize)) {
        sizeIndexMap(groupSize).enqueue(index)
      } else {
        val newQueue = mutable.Queue[Int]()
        newQueue.enqueue(index)
        sizeIndexMap.put(groupSize, newQueue)
      }
    }

    val answer = mutable.Buffer[List[Int]]()
    for (size <- sizeIndexMap.keysIterator) {
      val q = sizeIndexMap(size)
      while (q.nonEmpty) {
        val subAnswer = mutable.Buffer[Int]()
        for (i <- 0 until size) {
          subAnswer += q.dequeue()
        }
        answer += subAnswer.toList
      }
    }
    answer.toList
  }
}
