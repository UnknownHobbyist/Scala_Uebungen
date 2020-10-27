object BOOL{
  def nand(a: Boolean, b:Boolean): Boolean = {
    if(!(a && b))
      return true

    return false
  }

  def not(a: Boolean): Boolean = {
    return nand(a, a)
  }

  def and(a: Boolean, b: Boolean): Boolean = {
    return not(nand(a, b))
  }

  def or(a: Boolean, b: Boolean): Boolean = {
    return nand(not(a), not(b))
  }

  def nor(a: Boolean, b: Boolean): Boolean = {
    return not(or(a, b))
  }

  def xor(a: Boolean, b: Boolean): Boolean = {
    return and(nand(a, b), or(a, b))
  }
}