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

    println(createNeuronalNet([1, 2, 3]))

  }

  def createNeuronalNet(shape: Array[Int]): Array[Array[float]] = {

    return [[0.5]]

  }

}
