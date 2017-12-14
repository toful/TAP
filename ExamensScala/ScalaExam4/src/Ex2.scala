/**
 * Created by pedro on 11/26/15.
 */



object Ex2 extends scala.App {

  val list = List(22,11,56,76,343,11,33,4,2,67,8)
  println(central(list))


  def central(ints:List[Int]):(Int,List[Int],List[Int])= (ints.head,ints.filter(_<ints.head).sorted,ints.filter(_>ints.head).sorted)



}