object LcProblem27 {
  def removeElement(nums: Array[Int], value: Int): Int = {
    var i = 0
    var n = nums.length
    while (i < n) {
      if (nums(i) == value) {
        nums(i) = nums(n - 1)
        n -= 1
      } else {
        i += 1
      }
    }
    n
  }
}