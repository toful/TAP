/*1. Escribe una funcion que calcule las apariciones de un valor en una lista. Escribe el código con recursividad acumulativa.

 val list = List(22,11,56,76,343,11,33,4,2,67,8)
 println(count(list,11))*/

object Ex1 extends scala.App{

  def count(list:List[Int], value:Int):Int={
    def countAcc(list:List[Int], value:Int, acc:Int):Int= list match{
      case Nil => acc
      case x::xs => if(x==value) countAcc(xs, value, acc+1) else countAcc(xs, value, acc)
    }
    countAcc(list, value, 0)
  }
  val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(count(list,11))

}
