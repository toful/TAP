/**
 * Created by pedro on 11/27/15.
 */

object Ex4 extends scala.App {


  def sum(x:Int,y:Int) = x+y


  println(ex4(sum,0,List(1,2,3), List(2,3,4)))
  println(ex4b(sum,0,List(1,2,3), List(2,3,4)))



 def ex4[T](f: (T,T) => T, default:T, list: List[T], list2:List[T]): T = {
   def ex4_aux[T](result: T, f: (T,T) => T, list: List[T], list2:List[T]): T = (list,list2) match {
     case (Nil,_) => result
     case (_,Nil) => result
     case (x :: xs, y::ys) => ex4_aux(f(result,f(x,y)), f, xs,ys)
   }
   ex4_aux(default,f,list,list2)
 }


  def ex4b[T](f: (T,T) => T, default:T, list: List[T], list2:List[T]): T = (list,list2) match {
    case (Nil,_) => default
    case (_,Nil) => default
    case (x :: xs, y::ys) => f(f(x,y),ex4b(f,default,xs,ys))

  }


}