package LeetCode

import scala.collection.mutable

object Problem925 extends App {
  println(group("aaleex"))
  def isLongPressedName(name: String, typed: String): Boolean = {
    val n = group(name)
    val t = group(typed)

    if (n.length != t.length) {
      return false
    }

    for ((ni, index) <- n.zipWithIndex) {
      val ti = t(index)
      if (ni.head != ti.head) {
        return false
      }
      if (ni.length > ti.length) {
        return false
      }
    }
    true
  }

  def group(str: String): Array[String] = {
    val res = mutable.Buffer[String]()
    var sb = new mutable.StringBuilder()

    var chList = str.toList

    var cur = chList.head
    sb.append(cur)
    chList = chList.tail

    for (ch <- chList) {
      if (ch == cur) {
        sb.append(ch)
      } else {
        res += sb.toString()
        sb = new mutable.StringBuilder()
        sb.append(ch)
      }
      cur = ch
    }
    if (sb.nonEmpty) {
      res += sb.toString()
    }
    res.toArray
  }
}
