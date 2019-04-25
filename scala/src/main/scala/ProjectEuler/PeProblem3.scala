package ProjectEuler

object PeProblem3 extends App {
  def isPrime(n: Long): Boolean = (2 to math.sqrt(n).toInt) forall (x => n % x != 0)
  def factor(i: Long, list: List[Long] = Nil): List[Long] = {
    println(s"factor ${i}, ${list}")
    val x = (2l to math.sqrt(i).toLong).find(x => i % x == 0 && isPrime(x))
    if (x.isEmpty) {
      i :: list // last one is always prime
    } else {
      factor(i / x.get, x.get :: list)
    }
  }

  val answer = factor(600851475143l).max
  println(answer)
}
