package LeetCode

import scala.collection.mutable

object LcProblem394 extends App{
  println(decodeString("3[a]2[bc]"))
  def decodeString(s: String): String = {
    val outer = mutable.Buffer[Char]()

    for (ch <- s.toCharArray) {
      if (ch != ']') {
        outer += ch
      } else {
        val wordBuffer = mutable.Buffer[Char]()
        while (outer.last != '[') {
          wordBuffer.prepend(outer.remove(outer.length - 1))
        }
        outer.remove(outer.length - 1) // NOTE: delete [
        val word = wordBuffer.mkString
//        println("word", word, outer.mkString)

        val numberBuffer = mutable.Buffer[Char]()
        while (outer.nonEmpty && outer.last.isDigit) {
          numberBuffer.prepend(outer.remove(outer.length - 1))
        }

        for (i <- 0 until numberBuffer.mkString.toInt) {
          outer ++= word.toCharArray
        }
      }
    }

    outer.mkString
  }
}
