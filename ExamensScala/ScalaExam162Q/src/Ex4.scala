import scala.annotation.tailrec

/**
 * Created by pedro on 13/01/16.
 */

object Ex4 extends scala.App{

  def min[T](ints: List[T],less:(T,T)=>Boolean,initial:T,theMin:T): T = {
      ints match {
        case Nil => theMin
        case x :: tail =>
          val newMin:T = if (less(x,theMin)) x else theMin
          min(tail, less,initial,newMin)
      }
    }



  def intless(a:Int,b:Int):Boolean = a<b

  println(min(List(3,50,6,7,8,2,9),intless,Int.MaxValue,Int.MaxValue))


}