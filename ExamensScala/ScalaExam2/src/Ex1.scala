/**
 * Created by pedro on 11/26/15.
 */

import scala.annotation.tailrec

/**
 * Created by pedro on 25/11/15.
 */


object Ex1 extends scala.App{

  val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(count(list,11))



  def count(ints: List[Int],value:Int): Int = {
    @tailrec
    def countAccum(ints: List[Int], value: Int,result:Int): Int = {
      ints match {
        case Nil => result
        case x :: tail =>
          val newResult = if (x == value) 1+result else result
          countAccum(tail, value,newResult)
      }
    }
    countAccum(ints, value,0)
  }



}