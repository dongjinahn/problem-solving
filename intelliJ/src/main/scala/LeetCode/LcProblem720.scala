package LeetCode

import scala.collection.mutable

object LcProblem720 {
  def longestWord(words: Array[String]): String = {
    if (words.length == 0) {
      return ""
    }

    def myCompareTo(a: String, b: String): Boolean = {
      if (a.length == b.length) {
        a.compareTo(b) < 0
      } else {
        a.length.compareTo(b.length) < 0
      }
    }

    val sortedWords = words.sortWith(myCompareTo)

    val traversedSet = mutable.Set[String]()
    var max = sortedWords(0)

    for (word <- sortedWords) {
      if (word.length == 1) {
        traversedSet += word
      } else {
        val substring1 = word.substring(1)
        val substring2 = word.substring(0, word.length - 1)

        if (traversedSet.contains(substring1) || traversedSet.contains(substring2)) {
          if (word.length == max.length) {
            if (myCompareTo(word, max)) {
              max = word
            }
          } else if (myCompareTo(max, word)) {
            max = word
          }
          traversedSet += word
        }
      }
    }
    max
  }
}
