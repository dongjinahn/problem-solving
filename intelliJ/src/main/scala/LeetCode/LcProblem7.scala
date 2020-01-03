package LeetCode

object LcProblem7 extends App {
  def reverse(x: Int): Int = {
    val res = scala.util.Try[Int](math.abs(x).toString.reverse.toInt)
    if (res.isFailure) { // if reversed integer parsing overflowed
      0
    } else if (x < 0) {
      -res.get
    } else {
      res.get
    }
  }

  println(reverse(-120))
}
