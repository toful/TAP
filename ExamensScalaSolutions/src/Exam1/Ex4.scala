package Exam1

object Ex4 extends scala.App{

  def foldr_filter[T](condicion:(T)=>Boolean, operation:(T,T)=>T, value:T, list:List[T]):T= list match{
    case Nil => value
    case x::xs => if(condicion(x)) operation(x,foldr_filter(condicion,operation,value,xs)) else foldr_filter(condicion,operation,value,xs)
  }

  def odd(elem:Int)= elem%2==0
  def sum(x:Int, y:Int)= x+y

  println(foldr_filter(odd, sum, 0, List(3,6,4,5)))

  val suma_pares=foldr_filter(odd, sum, 0, _:List[Int])
  println(suma_pares(List(3,6,4,5)))
}
