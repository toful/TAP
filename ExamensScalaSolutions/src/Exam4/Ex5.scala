package Exam4

/*5. Implementar el ejercicio 4 usando paso de parametros por curry.
Mediante parametrización parcial genera la funcion odds que acepte dos listas y devuela la lista de tuplas de elementos pares
println (odds (List(1,2,3,4,5)) (List(1,2,3,4,5)))
List((2,2), (4,4))
println (odds (List(1,2,3,4,5)) (List(1,6,3,8,2)))
List((2,6), (4,8))
*/
object Ex5 extends scala.App{

  def ex4a[T] (list:List[T])(list2:List[T])(f:((T,T)=>Boolean)):List[(T,T)]= (list,list2) match{
    case (_,Nil)=>Nil
    case (Nil,_)=>Nil
    case (x::xs,a::as) => if(f(x,a)) (x,a)::ex4a(xs)(as)(f) else ex4a(xs)(as)(f)
  }

  def ex4b[T](f:((T,T)=>Boolean))(list:List[T])(list2:List[T]):List[(T,T)]={
    def ex4Acc[T](list:List[T])(list2:List[T])(f:((T,T)=>Boolean))(acc:List[(T,T)]):List[(T,T)]= (list,list2) match{
      case (_,Nil)=>acc.reverse
      case (Nil,_)=>acc.reverse
      case (a::as,b::bs)=> if(f(a,b)) ex4Acc(as)(bs)(f)((a,b)::acc) else ex4Acc(as)(bs)(f)(acc)
    }
    ex4Acc(list)(list2)(f)(Nil)
  }

  val odds = ex4b ((a:Int,b:Int)=>a%2==0 && b%2==0) (_:List[Int]) _

  val odds2 = ex4a (_:List[Int]) (_:List[Int]) ((a:Int,b:Int)=>a%2==0 && b%2==0)

  println (odds (List(1,2,3,4,5)) (List(1,2,3,4,5)))
  //List((2,2), (4,4))
  println (odds (List(1,2,3,4,5)) (List(1,6,3,8,2)))
  //List((2,6), (4,8))
  //println (odds2 (List(1,2,3,4,5)) (List(1,6,3,8,2)))

}
