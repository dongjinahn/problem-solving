package basics

/**
  * https://medium.com/@jun.choi.4928/javascript%EB%A1%9C-%EC%88%9C%EC%97%B4%EA%B3%BC-%EC%A1%B0%ED%95%A9-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-21df4b536349
  */
object Combination extends App {
  def combination(l: List[Int], selectNumber: Int): List[List[Int]] = {
    if (selectNumber == 1) {
      return l map {
        x => List(x)
      }
    }

    val ans = scala.collection.mutable.Buffer[List[Int]]()

    for ((fixed, index) <- l.zipWithIndex) {
      val rest = l.slice(index + 1, l.length)
      val combinations = combination(rest, selectNumber - 1)
      ans ++= combinations map { x => fixed +: x }
    }

    ans.toList
  }

  println(combination(List(1, 2, 3, 4), 3))

  println(List(1,2,3,4).combinations(3).toList)
}
