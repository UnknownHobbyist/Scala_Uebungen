object SUM{
  def sumN(n: Int): Int = {
    return (n * (n+1))/2
  }

  def sumFromTo(a: Int, b: Int): Int = {
    if(b <= a)
      return 0

    return sumN(b) - sumN(a)
  }

  def sumOddN(n: Int): Int = {
    if(n == 1)
      return 1

    return (2 * n - 1) + sumOddN(n-1)
  }

  def iSumOddN(n: Int): Int = {
    return n * n
  }
}