import java.util.Scanner
import scala.collection.mutable.ListBuffer
object normal {
val scanner=new java.util.Scanner(System.in)
println("Introduzca numero n")
var n = scanner.nextInt()
var a=0
var b=1
var c=1
var d=0
for(i<-1 to n){
 print(a+ ",")
 d=a+b+c
 a=b
 b=c
 c=d
}
println(" ")
}    