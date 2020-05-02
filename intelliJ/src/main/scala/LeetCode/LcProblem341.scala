package LeetCode

import scala.collection.mutable

object LcProblem341 {

  abstract class NestedInteger {

    // Return true if this NestedInteger holds a single integer, rather than a nested list.
    def isInteger: Boolean

    // Return the single integer that this NestedInteger holds, if it holds a single integer
    def getInteger: Int

    // Set this NestedInteger to hold a single integer.
    def setInteger(i: Int)

    // Return the nested list that this NestedInteger holds, if it holds a nested list
    def getList: Array[NestedInteger]

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    def add(ni: NestedInteger) = {}
  }

  class NestedIterator(_nestedList: List[NestedInteger]) {
    var index = -1
    var arr = mutable.Buffer[Int]()

    def flatten(nl: Seq[NestedInteger]): Unit = {
      if (nl.isEmpty) {
        return
      }

      if (nl.head.isInteger) {
        arr += nl.head.getInteger
        flatten(nl.tail)
      } else {
        flatten(nl.head.getList)
        flatten(nl.tail)
      }
    }

    flatten(_nestedList)

    def next(): Int = {
      index += 1
      arr(index)
    }

    def hasNext(): Boolean = {
      index < arr.length - 1
    }

  }

}
