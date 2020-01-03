package LeetCode

object LcProblem14 extends App {
  def findCommonPrefix(a: String, b: String): String = {
    var i = 1
    var cp = ""
    var breakToggle = true
    while (i <= b.length && breakToggle) {
      val subB = b.substring(0, i)
      if (a.startsWith(subB)) {
        cp = subB
      } else {
        breakToggle = false
      }
      i += 1
    }
    cp
  }
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.length == 0) {
      return ""
    }
    if (strs.length == 1) {
      return strs(0)
    }

    var i = 2
    var commonPrefix = findCommonPrefix(strs(0), strs(1))
    while (commonPrefix.length != 0 && i < strs.length) {
      commonPrefix = findCommonPrefix(commonPrefix, strs(i))
      i += 1
    }
    commonPrefix
  }
  println(longestCommonPrefix(Array("flower", "flow", "flight")))
  println(longestCommonPrefix(Array("dog","racecar","car")))
}
