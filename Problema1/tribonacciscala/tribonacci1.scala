object tribo extends App {
	def fib(n:Int):Int={
		if (n==1)
			return 0
		if (n==2)
			return 1
		if (n==3)
			return 1
		else return fib(n-1) + fib(n-2) + fib(n-3)
	}
	println(fib(7))	
}
