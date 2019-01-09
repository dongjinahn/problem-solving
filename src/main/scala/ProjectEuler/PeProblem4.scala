package ProjectEuler

object PeProblem4 extends App {
  def isPalindrome(i: Int): Boolean = {
    val s = i.toString
    if (s.length % 2 == 0) {
      val (a, b) = s.splitAt(s.length / 2)
      a == b.reverse
    } else {
      val (a, b) = s.splitAt((s.length - 1) / 2)
      b.substring(1).reverse == a
    }
  }
  val list = for {
    x <- 100 to 999
    y <- 100 to x
    if isPalindrome(x * y)
  } yield x * y

  println(list.max)
}
