/**
 * Created by pedro on 27/11/15.
 */

object Ex5 extends scala.App {

  val l = List(1,2,3,4,5,6)


  def greater(x:Int)= x>4
  def incr(x:Int)=x+1




  val incr_greater = ex5 (incr) (greater) _

  println (incr_greater (l))




  def ex5[T](f: (T) => T) (f2:(T)=>Boolean) (list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => if (f2(x)) f(x)::ex5(f) (f2) (xs) else ex5(f) (f2) (xs)
  }


}