package LeetCode

object LcProblem3 extends App {
  def lengthOfLongestSubstring(s: String): Int = {
    var max = 0
    var queue = new scala.collection.mutable.Queue[Char]()
    var currentIndex = 0
    for (char <- s) {
      var indexOf = queue.indexOf(char)
      while (indexOf != -1) {
        queue.dequeue()
        indexOf -= 1
      }
      queue += char
      if (queue.length > max) {
        max = queue.length
      }
      currentIndex += 1
    }
    max
  }

  val a = lengthOfLongestSubstring("abcabcbb")
  println(s"a $a")
  val b = lengthOfLongestSubstring("bbbbb")
  println(s"b $b")
  val c = lengthOfLongestSubstring("pwwkew")
  println(s"c $c")
}
