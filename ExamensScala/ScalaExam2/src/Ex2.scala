/**
 * Created by pedro on 11/26/15.
 */



object Ex2 extends scala.App {


  val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(count(list,11))

  println(count2(list,11))




  def count(list:List[Int],value:Int):Int = list.filter(_==value).length
  def count2(list:List[Int],value:Int):Int = list.count(_==value)



}