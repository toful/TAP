/**
 * Created by pedro on 11/26/15.
 */

import scala.annotation.tailrec

/**
 * Created by pedro on 25/11/15.
 */


object Ex1 extends scala.App{

  val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(central(list))



  def central(ints: List[Int]):  (Int,List[Int],List[Int]) = {
    @tailrec
    def centralAccum(ints: List[Int], first:Int,left:List[Int],right:List[Int]): (Int,List[Int],List[Int]) = ints match {
        case Nil => (first,left.sorted,right.sorted)
        case x :: tail =>  if (x < first) centralAccum(tail,first,x::left,right) else centralAccum(tail,first,left,x::right)
      }
    centralAccum(ints.tail,ints.head,Nil,Nil)
  }



}