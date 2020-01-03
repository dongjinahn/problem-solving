package ProjectEuler

object PeProblem2 extends App {
  //  var memo = Map[Int, Int](1 -> 1, 2 -> 2)
  //  var answerList = List[Int]()
  //
  //  def fib(x: Int): Int = {
  //    if (memo isDefinedAt x) {
  //      memo(x)
  //    } else {
  //      val value = fib(x - 1) + fib(x - 2)
  //      memo += (x -> value)
  //      value
  //    }
  //  }
  //
  //  var n = 1
  //  var value = fib(1)
  //  while (value <= 4000000) {
  //    answerList = value :: answerList
  //    n += 1
  //    value = fib(n)
  //  }
  //  answerList = answerList.filter(_ % 2 == 0)
  //
  //  println(answerList.sum)
  def solve(l: List[Int]): List[Int] = {
    val value = l.head + l.tail.head
    if (value > 4000000) {
      l
    } else {
      solve(value :: l)
    }
  }
  val answerList2 = solve(List(2, 1))
  println(answerList2.filter(_ % 2 == 0).sum)
}
