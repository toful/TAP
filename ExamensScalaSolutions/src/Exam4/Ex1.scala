package Exam4
/*
1. Implementa la funcion replace(list,list2,value) que devuelva una lista reemplazando los elementos de list que aparezcan en list2 por value.
Usa recursividad de pila y acumulativa.

*/

object Ex1 extends scala.App {

  def replace[T](list:List[T], list2:List[T], value:T):List[T] =list match{
    case Nil => Nil
    case x::xs => if(list2.contains(x)) value::replace(xs, list2, value) else x::replace(xs, list2, value)
  }

  def replace2[T](list:List[T], list2:List[T], value:T):List[T] ={
    def replaceAcc[T](list:List[T], list2:List[T], value:T, acc:List[T]):List[T] =list match{
      case Nil => acc
      case x::xs => if(list2.contains(x)) replaceAcc(xs, list2, value, value::acc) else replaceAcc(xs, list2, value, x::acc)
    }
    replaceAcc(list, list2, value, List[T]()).reverse
  }

  val list = List(1,2,3,4,5,4,7,4,9)
  val veto = List(3,7)

  println(replace(list,veto,0))
  println(replace2(list,veto,0))

}
