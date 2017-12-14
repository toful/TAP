import scala.annotation.tailrec

/**
 * Created by pedro on 25/11/15.
 */


object Ex1 extends scala.App{
  val list = List(1,2,3,4,5,4,7,4,9)
  val veto = List(3,7)


  println(replace(list,veto,0))
  println(replace2(list,veto,0))




  def replace[T](list: List[T],list2:List[T],value:T): List[T] = {
    @tailrec
    def replaceAccum(list: List[T], list2:List[T],acc:List[T],value:T): List[T] = {
      list match {
        case Nil => acc.reverse
        case x :: tail =>
          val newVal = if (list2.contains(x)) value else x
          replaceAccum(tail,list2,newVal::acc,value)
      }
    }
    replaceAccum(list,list2,Nil,value)
  }


  def replace2[T](list: List[T],list2:List[T],value:T): List[T] = list match {
        case Nil => Nil
        case x :: tail =>
          val newVal = if (list2.contains(x)) value else x
          newVal:: replace2(tail,list2,value)
  }







}