package LeetCode

import scala.collection.mutable

object LcProblem1387 {
  def getKth(lo: Int, hi: Int, k: Int): Int = {
    (lo to hi).map(x => (PowerValue(x).get(), x)).sorted.apply(k - 1)._2
  }

  case class PowerValue(x: Int) {
    def get(): Int = {
      var res = x
      var count = 0
      while (res != 1) {
        if (res % 2 == 0) {
          res = res / 2
        } else {
          res = 3 * res + 1
        }
        count += 1
      }
      count
    }
  }

}
