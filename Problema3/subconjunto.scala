import java.util.Scanner
import scala.collection.mutable.ListBuffer
object subconjunto {
   //[1,5,2,8,6,7,4] [1,5,8,7] 
    //[1,2,4,6] [1,4,8] 
	var l1 = new ListBuffer[Int]()
	var l2 = new ListBuffer[Int]()
	var c=0
	var c2=0
	val scanner=new java.util.Scanner(System.in)
	println("Introduzca el tamaño del conjunto")
	var n1 = scanner.nextInt()
	println(n1)
	println("Ingrese los valores")
	while (n1>c){
	 var n = scanner.nextInt()
	 l1.append(n)
	 print(n+" ")
	 c=c+1
	}
	 println(" ")
	println(l1.toList)
	println("Introduzca el tamaño del subconjunto")
	var n2 = scanner.nextInt()
	println(n2)
	println("Introduzca los datos")
	while (n2>c2){
	 var n3 = scanner.nextInt()
	 l2.append(n3)
	 print(n3+" ")
	 c2=c2+1
	}
	println("")
	println(l2.toList)
	var l3=l1.intersect(l2)
	if(l3.length==l2.length){
	 println("Verdad")
	}
	else{ 
	 println("Falso")
	}
 
}    