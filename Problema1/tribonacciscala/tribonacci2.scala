object Tribonacci {

  private def formatTribo(x:Int) = {
    for(i<-0 to x-1)
      println(tribo(i))
  }

  def tribo(n: Int): Int = {
    if ( n == 0 ) 0
    else if ( n == 1 ) 1
    else if ( n == 2 ) 1
    else tribo( n-1 ) + tribo( n-2 ) + tribo( n-3 )

  }
  
  def main(args: Array[String]): Unit =
    println(formatTribo(7)) 
}
