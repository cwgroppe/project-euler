object Problems001{
  //#1 - Find the sum of all the multiples of 3 or 5 below 1000.
  println((1 to 999).toList.filter(x => x % 5 == 0 || x % 3 == 0).sum)
  //233168
  
  //#2 - By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
  def fib(num: Int): BigInt = {
    val buf = scala.collection.mutable.ListBuffer.empty[BigInt]
    @scala.annotation.tailrec
    def fibFcn(n: Int, acc1: BigInt, acc2: BigInt): BigInt = n match {
      case 0 => acc1
      case 1 => acc2
      case _ => {
        val x = acc1 + acc2
        if(x % 2 == 0){buf += x} 
        fibFcn(n - 1, acc2, x)
      }
    }
    val f = fibFcn(num, 0, 1)
    println(buf.toList.sum)
    f
  }
  fib(33)
  //4613732
}

