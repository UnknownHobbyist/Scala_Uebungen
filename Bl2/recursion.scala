object RECURSION{
  def isEven(a: Int): Boolean = {
    if(a == 0)
      return true

    return isOdd(a-1)
  }

  def isOdd(a: Int): Boolean = {
    if(a == 0)
      return false

    return isEven(a-1)
  }

  def pred(x: Int): Int = return x - 1
  def succ(x: Int): Int = return x + 1
  def isZero(x: Int): Boolean = return x == 0

  def add(a: Int, b: Int): Int = {
    if (!isZero(b))
      return add(succ(a), pred(b))
  
    return a
  }

  def mult(a: Int, b: Int): Int = {
    if (!isZero(b))
      return add(a, mult(a, pred(b)))

    return 0
  }

  def sumFromTo(a: Int, b: Int): Int = {
    if(a > b)
      return 0

    if(a == b)
      return 0

    return add(b, sumFromTo(a, pred(b)))
  }

  def sqrt(x: Int): Float = {
    if(x == 0)
      return 0
     
    return newton(x, 1)
  }

  def newton(x: Int, fxi: Float): Float = {
    val fxj: Float = (fxi + x/fxi) / 2

    if(fxj == fxi)
      return fxj

    return newton(x, fxj)
  }
}