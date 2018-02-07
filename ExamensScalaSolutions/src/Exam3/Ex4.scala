package Exam3

/*4. Reescribe la funcion del ejercicio 1 para que soporte cualquier tipo. Pasale para ello una funcion menorque.
 NOTA: no usar funciones internas auxiliares como en min.
*/

object Ex4 extends scala.App {

  def menor(a:Int, b:Int)= if(a<b) a else b

  def minList[T](list:List[T],f: (T,T)=>T, theMin:T):T = list match{
    case Nil => theMin
    case x::xs => f(x, minList(xs,f,theMin))
  }

  val l=List(3,50,6,7,8,2,9)
  println(minList(l,menor,Int.MaxValue))
}
