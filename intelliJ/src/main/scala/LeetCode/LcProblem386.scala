package LeetCode

import scala.collection.mutable

object LcProblem386 extends App {
  println(lexicalOrder(100))
  def lexicalOrder(n: Int): List[Int] = {
    val res = mutable.Buffer[Int]()

    def dfs(k: Int): Unit = {
      if (k > n) {
        return
      }
      res += k
      val x = k * 10
      dfs(x)
      for (i <- 1 until 10) {
        if ((x + i) > n) {
          return
        }
        dfs(x + i)
      }
    }

    for (i <- 1 to 9){
      dfs(i)
    }

    res.toList
  }
}
