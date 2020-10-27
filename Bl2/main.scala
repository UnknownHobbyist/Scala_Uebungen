object Main {
  def main(args: Array[String]): Unit = {
    
    /**----Aufgabe 1----**/
    import BOOL._
    println("\n\n----Aufgabe 1----")
    println("NAND: " + BOOL.nand(false, false) + " " + BOOL.nand(true, false) + " " + BOOL.nand(true, true))
    println("NOT : " + BOOL.not(true) + " " + BOOL.not(false))
    println("AND : " + BOOL.and(false, false) + " " + BOOL.and(true, false) + " " + BOOL.and(true, true))
    println("OR  : " + BOOL.or(false, false) + " " + BOOL.or(true, false) + " " + BOOL.or(true, true))
    println("XOR : " + BOOL.xor(false, false) + " " + BOOL.xor(true, false) + " " + BOOL.xor(true, true))
    

    /**----Aufgabe 2----**/
    import SUM._
    println("\n\n----Aufgabe 2----")
    println("sumN   : " + SUM.sumN(10))
    println("sumFT  : " + SUM.sumFromTo(5, 10))
    println("sumOdd : " + SUM.sumOddN(1) + ", " + SUM.sumOddN(2) + ", " + SUM.sumOddN(3))
    println("sumOddi: " + SUM.iSumOddN(1) + ", " + SUM.iSumOddN(2) + ", " + SUM.iSumOddN(3))
    

    /**----Aufgabe 3----**/
    import RECURSION._  
    println("\n\n----Aufgabe 3----")
    println("isEven: " + RECURSION.isEven(2) + " " + RECURSION.isEven(3))
    println("isOdd : " + RECURSION.isOdd(2) + " " + RECURSION.isOdd(3))
    println("add   : " + RECURSION.add(2, 3))
    println("mult  : " + RECURSION.mult(2, 3))
    println("sumFT : " + RECURSION.sumFromTo(5, 10))
    println("sqrt  : " + RECURSION.sqrt(3))
  }
}
