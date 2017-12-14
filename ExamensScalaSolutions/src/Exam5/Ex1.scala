package Exam5
/*
1. Escribe una funcion central que reciba una lista de enteros y devuelva una tupla con tres elementos: el primer elemento de la lista,
  una lista con los menores que el primero ordenados, y otra lista con los mayores que el primero ordenados. Podeis usar la funcion de listas "sorted".
*/
object Ex1 extends scala.App{

  def ex1(l:List[Int]):(Int, List[Int], List[Int]) ={
    def ex1Accum (l:List[Int], head:Int, accBig:List[Int], accLit:List[Int]):(Int, List[Int], List[Int])= l match{
      case Nil => (head,accLit.sorted,accBig.sorted)
      case x::xs => if(x>head) ex1Accum(xs,head,x::accBig,accLit) else ex1Accum(xs,head,accBig,x::accLit)
    }
    ex1Accum(l.tail,l.head,Nil,Nil)
  }

  val l = List(9,2,4,3,5,7,5,46,4,54,56,45,65,64,7654,4,334)
  println(ex1(l))
}
