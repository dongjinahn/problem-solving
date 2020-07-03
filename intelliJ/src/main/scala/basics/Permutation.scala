package basics

/**
  * https://medium.com/@jun.choi.4928/javascript%EB%A1%9C-%EC%88%9C%EC%97%B4%EA%B3%BC-%EC%A1%B0%ED%95%A9-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0-21df4b536349
  */
object Permutation extends App {
  def permutation(l: List[Int], selectedNumber: Int): List[List[Int]] = {
    if (selectedNumber == 1) {
      return l map { x => List(x) }
    }

    val ans = scala.collection.mutable.Buffer[List[Int]]()
    for ((fixed, index) <- l.zipWithIndex) {
      val res = l.patch(index, Nil, 1)
      val permutations = permutation(res, selectedNumber - 1)
      ans ++= permutations map { x => fixed +: x }
    }
    ans.toList
  }

  println(permutation(List(1, 2, 3, 4), 3))
}
