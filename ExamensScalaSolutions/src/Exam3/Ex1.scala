package Exam3

/*1. Escribe un funcion que calcule el minimo elemento de una lista de enteros*/

object Ex1 extends scala.App {

  def min(a:Int, b:Int)= if(a<b) a else b

  def minList(list:List[Int]):Int = list match{
    case Nil => Int.MaxValue
    case x::xs => min(x, minList(xs))
  }

  val l=List(2,11,4,6,4,6,54,3,1,35,43,54365,53463,45,55,4656)
  println(minList(l))
}
