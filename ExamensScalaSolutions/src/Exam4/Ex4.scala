package Exam4
/* 4- Implementar la funcion "ex4" que acepte dos listas y una funcion de filtro. Si se cumple la funcion sobre elementos de las dos listas, devolvera
  las tuplas
 que cumplan la funcion.  Implementar la funcion con recursividad de pila y con acumulativa.
 Ejemplo:

  println(ex4a((a:Int,b:Int)=>a>b, List(1,4,8),List(1,3,5)))
 Resultado: List((4,3), (8,5))
*/

object Ex4 extends scala.App{

  def ex4a[T](list:List[T], list2:List[T], f:((T,T)=>Boolean)):List[(T,T)]= (list,list2) match{
    case (_,Nil)=>Nil
    case (Nil,_)=>Nil
    case (x::xs,a::as) => if(f(x,a)) (x,a)::ex4a(xs,as,f) else ex4a(xs,as,f)
  }

  def ex4b[T](list:List[T], list2:List[T], f:((T,T)=>Boolean)):List[(T,T)]={
    def ex4Acc[T](list:List[T], list2:List[T], f:((T,T)=>Boolean), acc:List[(T,T)]):List[(T,T)]= (list,list2) match{
      case (_,Nil)=>acc.reverse
      case (Nil,_)=>acc.reverse
      case (a::as,b::bs)=> if(f(a,b)) ex4Acc(as,bs,f,(a,b)::acc) else ex4Acc(as,bs,f,acc)
    }
    ex4Acc(list,list2,f,Nil)
  }

  println(ex4a(List(1,4,8),List(1,3,5),(a:Int,b:Int)=>a>b))
  println(ex4b(List(1,4,8),List(1,3,5),(a:Int,b:Int)=>a>b))

}
