object Main{

  def main(args: Array[String]): Unit = {

    //first we need a 2-dim array with randomized floating point numbers
    //second we need the feed forward algorithm which caculates the probability
    //  of a given input
    //third we need the backpropagation algorithm which takes the error value of the
    //  feedforward algorithm and adjusts the weights
    //--\\
    //all of this will be done in functional style
    //--\\

    // val matrix: Array[Array[Float]] = createNeuronalNet(Array(1, 2, 3))

    //type is actually : Array[Array[Float]] but not necessary
    val matrix = matrixBuilder(Array(5, 2, 3))

    println(matrix(0).mkString(" "))

  }

  def matrixBuilder(shape: Array[Int]): Array[Array[Float]] = {
    val rand = scala.util.Random

    def createRow(shape: Array[Int], net: Array[Array[Float]]): Array[Array[Float]] = {
      def createColumn(s: Int, col: Array[Float]): Array[Float] = {
        if(s == 0)
          return col

        return createColumn(s-1, col :+ rand.nextFloat)
      }

      if(shape.length == 0)
        return net

      return createRow(shape.tail, net :+ createColumn(shape.head, Array()))
    }
    return createRow(shape, Array())
  }

}
