import scala.annotation.tailrec

/**
 * Created by pedro on 25/11/15.
 */


object Ex1 extends scala.App{
  val list = List(1,2,3,4,5,4,7,4,9)
  println(replace(list,4,6666))



  def replace[T](list: List[T],value:T,value2:T): List[T] = {
    @tailrec
    def replaceAccum(list: List[T], value:T,value2:T,result:List[T]): List[T] = {
      list match {
        case Nil => result.reverse
        case x :: tail =>
          val newVal = if (x == value) value2 else x
          replaceAccum(tail,value,value2, newVal::result)
      }
    }
    replaceAccum(list,value,value2,Nil)
  }


}