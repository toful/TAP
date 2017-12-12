/**
 * Created by pedro on 11/27/15.
 */

object Ex4 extends scala.App {

  val l = List(1,2,3,4,5,6)


  def greater(x:Int)= x>4
  def incr(x:Int)=x+1
  


  println(ex4(incr,greater,l))
  println(ex4b(incr,greater,l))



 def ex4[T](f: (T) => T, f2:(T)=>Boolean,list: List[T]): List[T] = {
   def ex4_aux[T](result: List[T], f: (T) => T, f2: (T) => Boolean, list: List[T]): List[T] = list match {
     case Nil => result
     case x :: xs => if (f2(x)) ex4_aux(f(x) :: result, f, f2, xs) else ex4_aux(result, f, f2, xs)
   }
   ex4_aux(List(),f,f2,list).reverse
 }


  def ex4b[T](f: (T) => T, f2:(T)=>Boolean,list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => if (f2(x)) f(x)::ex4b(f, f2, xs) else ex4b(f, f2, xs)

  }


}